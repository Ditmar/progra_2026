import com.Car;
import com.Scooter;

public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car("Toyota Rv4", "2015", 5);
        car.start();
        car.stop();
        car.openBox();
        Scooter scooter = new Scooter("suzuki", "2026", true);
        scooter.start();
        scooter.stop();
    }
}
