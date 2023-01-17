package BALWAN;

import java.util.LinkedList;
import java.util.List;

public class BoundingBox implements Translationable {
    private Point2D top_left;
    private Point2D top_right;
    private Point2D bottom_left;
    private Point2D bottom_right;

    public BoundingBox(Point2D top_left, Point2D top_right, Point2D bottom_left, Point2D bottom_right) {
        this.top_left = top_left;
        this.top_right = top_right;
        this.bottom_left = bottom_left;
        this.bottom_right = bottom_right;
    }

    public void translate(Point2D point2D)
    {
        top_left.translate(point2D);
        top_right.translate(point2D);
        bottom_left.translate(point2D);
        bottom_right.translate(point2D);
    }

    public List<Point2D> getPoints()
    {
        LinkedList list = new LinkedList<Point2D>();
        list.add(top_left);
        list.add(top_right);
        list.add(bottom_left);
        list.add(bottom_right);
        return list;
    }

    public Point2D getTop_left() {
        return top_left;
    }

    public Point2D getTop_right() {
        return top_right;
    }

    public Point2D getBottom_left() {
        return bottom_left;
    }

    public Point2D getBottom_right() {
        return bottom_right;
    }
}
