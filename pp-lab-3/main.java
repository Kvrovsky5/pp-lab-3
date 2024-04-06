

import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class main {

    public static void main(String[] args) {
        Point center = new Point(2.5, 3.14);
        ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "Czerwony");

        System.out.println("Właściwości kolorowego koła:");
        System.out.println(coloredCircle);
    }
}