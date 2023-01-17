package BALWAN;

import BALWAN.Items.*;
import org.opencv.core.Core;

public class Main {
    public static void main (String[] args) throws InterruptedException {
        ComplexItem complexity = new ComplexItem();
        complexity.addChildren(new Triangle(true,
                new Point2D(20,-100),new Point2D(1500, -200), new Point2D(1000, -475), Color.BLACK));
        complexity.addChildren(new Circle(new Point2D(0,0),true,150,Color.GREEN));
        complexity.addChildren(new Segment(new Point2D(500,-300),new Point2D(0,0),Color.ORANGE));
        complexity.addChildren(new Segment(new Point2D(500,-300),new Point2D(0,-100),Color.RED));
        complexity.addChildren(new Rect(new Point2D(1000,-430),false,80,80,Color.RED));
        complexity.addChildren(new TextItem(new Point2D(1000,-500),"wesolyych swiat xD"));
        Scene scene = new Scene();
        scene.addItem(complexity);
        //complexity.translate(new BALWAN.Point2D(200,-100));

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
        scene.addItem(snowman);
        snowman.translate(new Point2D(-300,-150));
        scene.draw();
    }
}
