package BALWAN.Items;

import BALWAN.BoundingBox;
import BALWAN.Point2D;
import BALWAN.Translationable;
import org.opencv.core.Mat;

import java.util.List;

public abstract class Item implements Translationable {
    private Point2D position;
    private BoundingBox boundingBox;


    public Item(Point2D position) {
        this.position = position;
        this.boundingBox = new BoundingBox(position,position,position,position);
    }

    public void translate(Point2D translation) {
        boundingBox.translate(translation);}
    public abstract Mat draw(Mat image);

    public final Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public final BoundingBox getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    protected final void updateBoundingBox(List<Point2D> list)
    {
        int xMax = boundingBox.getBottom_right().getX();
        int xMin = boundingBox.getTop_left().getX();
        int yMax = boundingBox.getTop_right().getY();
        int yMin = boundingBox.getBottom_left().getY();
        int x,y;
        for (Point2D p : list)
        {
            x = p.getX();
            y = p.getY();
            if (x>xMax) xMax = x;
            else if (x<xMin) xMin = x;
            if (y>yMax) yMax = y;
            else if (y<yMin) yMin = y;
        }
        boundingBox = new BoundingBox(new Point2D(xMin,yMax),new Point2D(xMax,yMax),new Point2D(xMin,yMin), new Point2D(xMax,yMin));
        position = boundingBox.getTop_left();
    }
}
