package BALWAN;

import BALWAN.Items.*;
import org.opencv.core.Core;

public class Main {
    public static void main (String[] args) throws InterruptedException {

        Scene scene = new Scene();

        ComplexItem background = createBackground();
        ComplexItem snowman = createSnowman();
        ComplexItem snowman2 = createSnowman();

        scene.addItem(background, "tlo sceny obyczajowej");
        scene.addItem(snowman, "przemek balwan");
        scene.addItem(snowman2, "pawel balwan");
        snowman.translate(new Point2D(-700,-50));
        snowman2.translate(new Point2D(-150,-150));
        scene.draw();
    }

    private static ComplexItem createSnowman()
    {
        ComplexItem snowman = new ComplexItem();
        snowman.addChildren(new Circle(new Point2D(1000,-150),true,100,Color.WHITE));
        snowman.addChildren(new Circle(new Point2D(950,-300),true,150,Color.WHITE));
        snowman.addChildren(new Circle(new Point2D(900,-500),true,200,Color.WHITE));
        snowman.addChildren(new Circle(new Point2D(1102,-490),true,10,Color.BLACK));
        snowman.addChildren(new Circle(new Point2D(1100,-450),true,10,Color.BLACK));
        snowman.addChildren(new Circle(new Point2D(1102,-400),true,10,Color.BLACK));
        snowman.addChildren(new Circle(new Point2D(1120,-210),true,10,Color.BLACK));
        snowman.addChildren(new Circle(new Point2D(1050,-210),true,10,Color.BLACK));
        snowman.addChildren(new Triangle(false, new Point2D(1120,-230),
                new Point2D(1050, -230), new Point2D(1090, -250), Color.ORANGE));
        return snowman;
    }

    private static ComplexItem createBackground()
    {
        ComplexItem background = new ComplexItem();
        background.addChildren(new Triangle(true,
                new Point2D(20,-100),new Point2D(1500, -200), new Point2D(1000, -475), Color.BLACK));
        background.addChildren(new Circle(new Point2D(0,0),true,150,Color.GREEN));
        background.addChildren(new Segment(new Point2D(500,-300),new Point2D(0,0),Color.ORANGE));
        background.addChildren(new Segment(new Point2D(500,-300),new Point2D(0,-100),Color.RED));
        background.addChildren(new Rect(new Point2D(1000,-430),false,80,80,Color.RED));
        background.addChildren(new TextItem(new Point2D(1000,-500),"wesolych swiat xD"));
        return background;
    }
}
