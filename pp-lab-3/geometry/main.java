package geometry;

import geometry.Circle;
import geometry.Point;

public class main {

    public static void main(String[] args) {
        Point center = new Point(2.5, 3.14);
        Circle circle = new Circle(center, 5.0);

        System.out.println("Właściwości koła:");
        System.out.println("Środek: " + circle.getCenter());
        System.out.println("Promień: " + circle.getRadius());
        System.out.println("Obwód: " + circle.calculatePerimeter());
    }
}