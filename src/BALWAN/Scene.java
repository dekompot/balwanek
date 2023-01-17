package BALWAN;

import BALWAN.Items.Drawable;
import BALWAN.Items.Item;
import BALWAN.Items.ItemWithBoundingBox;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Scene {

    List<Drawable> items;
    List<String> names;

    public Scene() {
        items = new LinkedList<>();
        names = new LinkedList<>();
    }

    public void draw()
    {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat image = new Mat(1080, 1920, CvType.CV_8UC3, new Scalar(40, 40, 40));
        Scanner in = new Scanner(System.in);
        String s;
        for (int i = 0 ; i < items.size() ; i++)
        {
            System.out.println("otoczyc otoczka obiekt " + names.get(i) + " ktorego pozycja to " + items.get(i).getBoundingBox().getTop_left() +"? [Y/N]");
            s = in.nextLine();
            if ("y".equalsIgnoreCase(s))
            {
                new ItemWithBoundingBox(items.get(i)).draw(image);
            }
            else if ("n".equalsIgnoreCase(s))
            {
                items.get(i).draw(image);
            }
            else
            {
                System.out.println("zle napisales, nie rysujemy " + names.get(i));
            }
        }
        Imgcodecs.imwrite("scene.jpg", image);
        System.out.println("narysowano");
    }

    public void addItem(Drawable item, String name)
    {
        items.add(item);
        names.add(name);
    }
}
