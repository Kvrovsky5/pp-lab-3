

import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;
import geometry.Rectangle;
import geometry.Square;

public class main {

    public static void main(String[] args) {
        Square square = new Square(60.0);

        System.out.println(square); // Kwadrat o długości boku 5.0
        System.out.println("Pole powierzchni: " + square.calculateArea()); // 25.0
        System.out.println("Obwód: " + square.calculatePerimeter()); // 20.0
    }
}