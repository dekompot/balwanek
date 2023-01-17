package BALWAN;

import BALWAN.Items.Item;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;

import java.util.LinkedList;
import java.util.List;

public class Scene {

    List<Item> items;

    public Scene() {
        items = new LinkedList<>();
    }

    public void draw()
    {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat image = new Mat(1080, 1920, CvType.CV_8UC3, new Scalar(40, 40, 40));
        for (Item i : items)
        {
            i.draw(image);
        }
        Imgcodecs.imwrite("scene1.jpg", image);
    }

    public void addItem(Item item)
    {

        items.add(item);
    }
}
