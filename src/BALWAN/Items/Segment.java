package BALWAN.Items;

import BALWAN.Point2D;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import java.util.LinkedList;

public class Segment extends Primitive{
    Point2D start;
    Point2D end;
    public Segment(Point2D start, Point2D end, Color color) {
        super(start, color);
        this.start = start;
        this.end = end;
        LinkedList<Point2D> list = new LinkedList();
        list.add(start);
        list.add(end);
        updateBoundingBox(list);
        setPosition(getBoundingBox().getTop_left());
    }

    @Override
    public void translate(Point2D translation) {
        super.translate(translation);
        start.translate(translation);
        end.translate(translation);
    }

    public double getlength()
    {
        return Math.sqrt(start.getX()*start.getX()-end.getX()*end.getX()+start.getY()*start.getY()-end.getY()*end.getY());
    }

    @Override
    public Mat draw(Mat image) {
        Imgproc.line(image,start.getPoint(),end.getPoint(),color.get(),5);
        return image;
    }
}
