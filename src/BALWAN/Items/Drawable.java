package BALWAN.Items;

import BALWAN.BoundingBox;
import BALWAN.Translationable;
import org.opencv.core.Mat;

public interface Drawable extends Translationable {
    Mat draw(Mat image);
    BoundingBox getBoundingBox();
}
