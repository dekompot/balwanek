package BALWAN.Items;

import BALWAN.Point2D;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.imgproc.Imgproc;

import java.util.LinkedList;
import java.util.List;

public class Triangle extends Shape{
    private static Triangle INSTANCE;
    private Point2D p1;
    private Point2D p2;
    private Point2D p3;
    private Triangle(boolean filled, Point2D p1, Point2D p2, Point2D p3, Color color) {
        super(p1, filled, color);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        LinkedList<Point2D> list = new LinkedList();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        updateBoundingBox(list);
    }

    public static Triangle getInstance(boolean filled, Point2D p1, Point2D p2, Point2D p3, Color color)
    {
        if (INSTANCE == null)
            INSTANCE = new Triangle(filled, p1, p2, p3, color);
        return INSTANCE;
    }

    @Override
    public void translate(Point2D translation) {
        super.translate(translation);
        p1.translate(translation);
        p2.translate(translation);
        p3.translate(translation);
    }

    @Override
    public Mat draw(Mat image) {
        List<MatOfPoint> points = List.of(new MatOfPoint(p1.getPoint(),p2.getPoint(),p3.getPoint()));
        if (isFilled())
            Imgproc.fillPoly(image, points, color.get());
        else
            Imgproc.drawContours(image, points, 0, color.get(), 5);

        return image;
    }


    public Point2D getP1() {
        return p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public Point2D getP3() {
        return p3;
    }
}
