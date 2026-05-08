package utils;

public class Circle implements Shape {
    private Double radio;
    public Circle(Double radio) {
        this.radio = radio;
    }
    @Override
    public Double area() {
        Double area =  Math.PI * this.radio * this.radio;
        System.out.println("Circle area " + area);
        return area;
    }

    @Override
    public Double perimeter() {
        Double perimeter =  2 * this.radio * Math.PI;
        System.out.println("Circle Perimeter " + perimeter);
        return perimeter;
    }
    @Override
    public void info() {
        System.out.println("Circle ");
    }
    
}
