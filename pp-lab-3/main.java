

import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;
import geometry.Rectangle;

public class main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        System.out.println(rectangle); 
        System.out.println("Pole powierzchni: " + rectangle.calculateArea()); 
        System.out.println("Obwód: " + rectangle.calculatePerimeter()); 
    }
}