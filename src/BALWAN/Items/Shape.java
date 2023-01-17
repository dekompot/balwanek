package BALWAN.Items;

import BALWAN.Point2D;

public abstract class Shape extends  Primitive{
    boolean filled;
    public Shape(Point2D position, boolean filled, Color color) {
        super(position, color);
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
