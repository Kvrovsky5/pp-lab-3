

import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(2.5, 3.14), 5.0);
        circles[1] = new ColoredCircle(new Point(1.0, 2.0), 3.0, "Czerwony");
        circles[2] = new Circle(new Point(4.0, 5.0), 7.0);

        for (Circle circle : circles) {
            System.out.println("Pole powierzchni: " + circle.calculateArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor: " + coloredCircle.getColor());
            }
        }
    }
}