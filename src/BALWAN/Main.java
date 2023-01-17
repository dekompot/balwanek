package BALWAN;

import BALWAN.Items.*;
import org.opencv.core.Core;

public class Main {
    public static void main (String[] args) throws InterruptedException {
        Scene scene = new Scene();

        ComplexItem complexity = createBackground();
        scene.addItem(complexity);

        ComplexItem snowman = createSnowman();
        snowman.translate(new Point2D(0,0));
        scene.addItem(snowman);

        ComplexItem snowman1 = createSnowman();
        snowman1.translate(new Point2D(-700,-120));
        scene.addItem(snowman1);

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
        snowman.addChildren(Triangle.getInstance(false, new Point2D(1120,-230),
                new Point2D(1050, -230), new Point2D(1090, -250), Color.ORANGE));
        return snowman;
    }

    private static ComplexItem createBackground()
    {
        ComplexItem complexity = new ComplexItem();
        complexity.addChildren(Triangle.getInstance(true,
                new Point2D(20,-100),new Point2D(1500, -200), new Point2D(1000, -475), Color.BLACK));
        complexity.addChildren(new Circle(new Point2D(0,0),true,150,Color.GREEN));
        complexity.addChildren(new Segment(new Point2D(500,-300),new Point2D(0,0),Color.ORANGE));
        complexity.addChildren(new Segment(new Point2D(500,-300),new Point2D(0,-100),Color.RED));
        complexity.addChildren(new Rect(new Point2D(1000,-430),false,80,80,Color.RED));
        complexity.addChildren(new TextItem(new Point2D(1000,-500),"wesolych swiat xD"));
        return complexity;
    }
}
