import com.business.Car;

public class App {
    public static void main(String[] args) throws Exception {
        Car toyota = new Car("Toyota", "1999", 0);
        Car nissan = new Car("Nissan", "2025", 0);
        Car suzuki = new Car("Suzuki", "2016", 0);
        toyota.accelerate(1);
        toyota.accelerate(2);
        toyota.showInfo();
        nissan.accelerate(10);
        nissan.showInfo();
        suzuki.accelerate(5);
        suzuki.accelerate(1);
        suzuki.showInfo();
        
    }
}
