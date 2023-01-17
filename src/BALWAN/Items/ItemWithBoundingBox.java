package BALWAN.Items;

import BALWAN.BoundingBox;
import BALWAN.Color;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.imgproc.Imgproc;

public class ItemWithBoundingBox extends DrawableDecorator{
    public ItemWithBoundingBox(Drawable wrapee) {
        super(wrapee);
    }

    @Override
    public Mat draw(Mat image) {
        Imgproc.rectangle(image,getBoundingBox().getTop_left().getPoint(),
                getBoundingBox().getBottom_right().getPoint(),Color.RED.get(),2);
        return super.draw(image);
    }
}
