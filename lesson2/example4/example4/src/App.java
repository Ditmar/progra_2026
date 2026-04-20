import utils.Vector;

import utils.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Vector a = new Vector(10.0, -10.0);
        Vector b = new Vector(15.0, -23.0);
        
        calculator.plus(10, 10);
        calculator.plus(a, b);
    }
}
