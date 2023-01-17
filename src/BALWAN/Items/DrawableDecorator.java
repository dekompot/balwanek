package BALWAN.Items;

import BALWAN.BoundingBox;
import BALWAN.Point2D;
import org.opencv.core.Mat;

public class DrawableDecorator implements Drawable{
    private Drawable wrapee;
    protected BoundingBox boundingBox;
    public DrawableDecorator(Drawable wrapee)
    {
        this.wrapee = wrapee;
        this.boundingBox = wrapee.getBoundingBox();
    }
    @Override
    public Mat draw(Mat image) {
        return wrapee.draw(image);
    }

    @Override
    public BoundingBox getBoundingBox() {
        return wrapee.getBoundingBox();
    }

    @Override
    public void translate(Point2D point2D) {
        wrapee.translate(point2D);
    }
}
