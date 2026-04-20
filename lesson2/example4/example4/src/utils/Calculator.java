package utils;

public class Calculator {
    public Integer plus(Integer a, Integer b) {
        return a + b;
    }
    public Double plus(Double a, Double b) {
        return a + b;
    }
    public Vector plus(Vector a, Vector b){
        Vector result = new Vector(a.getX() + b.getX(), a.getY() + b.getY());
        return result;
    }

    
}
