
public class Main {

    public static void main(String[] args) {
        Point point = new Point(2.5, 3.14);

        System.out.println("Współrzędne punktu:");
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());

        point.setX(10.0);
        point.setY(20.0);

        System.out.println("\nNowe współrzędne punktu:");
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
    }
}