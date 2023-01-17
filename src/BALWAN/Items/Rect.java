package BALWAN.Items;

import BALWAN.Color;
import BALWAN.Point2D;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import java.util.LinkedList;

public class Rect extends Shape{
    int width;
    int height;
    public Rect(Point2D position, boolean filled, int width, int height, Color color) {
        super(position, filled, color);
        this.width = width;
        this.height = height;
        LinkedList<Point2D> list = new LinkedList<>();
        list.add(new Point2D(getPosition().getX()+width,getPosition().getY()-height));
        updateBoundingBox(list);
    }

    @Override
    public Mat draw(Mat image) {
        int thickness = 2;
        if (isFilled())
            thickness = -1;
        Imgproc.rectangle(image, getPosition().getPoint(), getBoundingBox().getBottom_right().getPoint(), color.get(), thickness);
        return image;
    }
}
