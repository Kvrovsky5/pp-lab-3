
public class main {

    
    public static void main(String[] args) {
        Point point = new Point(2.5, 3.14);
        Point center = new Point(2.5, 3.14);
        Circle circle = new Circle(center, 5.0);
        

        System.out.println("Współrzędne punktu:");
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());

        point.setX(10.0);
        point.setY(20.0);

        System.out.println("\nNowe współrzędne punktu:");
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());

        System.out.println("--------------------------");
        System.out.println("Właściwości koła:");
        System.out.println("Środek: " + circle.getCenter());
        System.out.println("Promień: " + circle.getRadius());
        System.out.println("Obwód: " + circle.calculatePerimeter());

        
    }
}
