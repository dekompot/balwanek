package BALWAN;

import org.opencv.core.Point;

public class Point2D implements Translationable {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void translate(Point2D point2D) {
        this.x += point2D.x;
        this.y += point2D.y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point getPoint()
    {
        return new Point(x,-y);
    }
}
