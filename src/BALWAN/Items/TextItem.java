package BALWAN.Items;

import BALWAN.Point2D;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

import java.util.LinkedList;

public class TextItem extends Item{
    private String text;

    public TextItem(Point2D position, String text) {
        super(position);
        this.text = text;
        LinkedList<Point2D> points = new LinkedList<>();
        points.add(getPosition());
        points.add(new Point2D((getPosition().getX()+text.length()*80),getPosition().getY()-80));
        updateBoundingBox(points);
    }

    @Override
    public Mat draw(Mat image) {
        Imgproc.putText(image, text, (new Point2D(getPosition().getX(),getPosition().getY()+80)).getPoint(), Imgproc.FONT_HERSHEY_DUPLEX, 3, new Scalar(200, 200, 200), 2);
        return image;
    }

    public String getText() {
        return text;
    }

}
