import java.util.ArrayList;

import utils.Circle;
import utils.Shape;
import utils.Triangle;
public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(2.0);
        Triangle triangle = new Triangle(2.4, 6.4);
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(triangle);
        shapeList.add(circle);
        showShapeData(shapeList);
    }
    public static void showShapeData(ArrayList<Shape> list) {
        for (Shape item : list) {
            item.area();
            item.perimeter();
            item.info();
        }
    }
}
