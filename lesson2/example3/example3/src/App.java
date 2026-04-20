import utils.Circle;
import utils.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Triangle triangle = new Triangle("red", 10.0, 40.0);
        Circle circle = new Circle("negro", 50.0);
        System.out.println("-> " + triangle.calcArea());
        System.out.println("-> " + circle.calcArea());
    }
}
