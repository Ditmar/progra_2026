package utils;

public class Triangle extends Shape {
    private Double base;
    private Double height;
    public Triangle(String color, Double base, Double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calcArea() {
        return this.base * this.height / 2;
    }
    
}
