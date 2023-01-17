package BALWAN.Items;

import org.opencv.core.Scalar;

public enum Color {
    BLACK(new Scalar(0, 0, 0)),
    WHITE(new Scalar(255, 255, 255)),
    RED(new Scalar(0,0,255)),
    ORANGE(new Scalar(20,100,250)),
    GREEN(new Scalar(0, 150, 0)),
    BLUE(new Scalar(200, 50, 50));

    private final Scalar rgb;
    Color(Scalar rgb) {
        this.rgb = rgb;
    }
    public Scalar get()
    {
        return this.rgb;
    }
}
