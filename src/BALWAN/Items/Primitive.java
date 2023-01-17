package BALWAN.Items;

import BALWAN.Point2D;

public abstract class Primitive extends Item {
    Color color;
    public Primitive(Point2D position, Color color) {
        super(position);
        this.color = color;
    }
}
