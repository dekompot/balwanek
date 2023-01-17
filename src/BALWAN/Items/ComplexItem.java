package BALWAN.Items;

import BALWAN.Point2D;
import org.opencv.core.Mat;

import java.util.LinkedList;
import java.util.List;

public class ComplexItem extends Item{

    private List<Item> children;

    public ComplexItem() {
        super(new Point2D(0,0));
        children = new LinkedList<Item>();
    }

    public List getChildren() {
        return children;
    }

    public void addChildren(Item item)
    {
        if (children.isEmpty()) setBoundingBox(item.getBoundingBox());
        else updateBoundingBox(item.getBoundingBox().getPoints());
        children.add(item);
    }

    @Override
    public void translate(Point2D translation) {
        super.translate(translation);
        for (Item i : children)
        {
            i.translate(translation);
        }
    }

    @Override
    public Mat draw(Mat image) {
        for (Item i : children)
        {
           i.draw(image);
        }
        return image;
    }
}
