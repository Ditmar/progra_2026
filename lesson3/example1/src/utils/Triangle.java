package utils;

public class Triangle implements Shape{
    private Double base;
    private Double height;
    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public Double area() {
        Double area =  this.base * this.height / 2;
        System.out.println("Triangle area " + area);
        return area;
    }

    @Override
    public Double perimeter() {
        Double l1 = this.base;
        Double l2 = this.height;
        Double l3 = Math.sqrt(l1 * l1 + l2 * l2);
        Double perimeter = l1 + l2 + l3;
        System.out.println("Triangle Perimeter " + perimeter);
        return perimeter;
    }
    @Override
    public void info() {
       System.out.println("Triangle ");
    }
    
}
