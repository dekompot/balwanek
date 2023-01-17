package BALWAN.Items;

import BALWAN.Color;
import BALWAN.Point2D;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import java.util.LinkedList;

public class Circle extends Shape{
    private int radius;
    public Circle(Point2D position, boolean filled, int radius, Color color) {
        super(position, filled, color);
        this.radius = radius;
        LinkedList<Point2D> list = new LinkedList();
        list.add(new Point2D(getPosition().getX()+radius+radius,getPosition().getY()-radius-radius));
        list.add(position);
        updateBoundingBox(list);
    }

    @Override
    public Mat draw(Mat image) {
        int thickness = 2;
        if (filled) thickness = -1;
        Imgproc.circle(image,(new Point2D(getPosition().getX()+radius,getPosition().getY()-radius)).getPoint(),radius,color.get(),thickness);
        return image;
    }
}
