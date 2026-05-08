import utils.Solve;
import utils.Result;

public class App {
    public static void main(String[] args) throws Exception {
        Solve resolve = (a, b, c) -> {
            Double dif =  b * b - 4 * a * c;
            if (dif < 0) {
                Result result = new Result(null, null);
                result.setMessage("hasn't solution!");
                return result;
            }
            Double x1 = (-b + Math.sqrt(dif) ) / 2 * a;
            double  x2 = (-b - Math.sqrt(dif) ) / 2 * a;
            Result result = new Result(x1, x2);
            return result;
        };
        Result solution =  resolve.apply(23.3, 34.3, 1.0);
        solution.print();
        
    }
}
