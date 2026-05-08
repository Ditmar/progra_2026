package utils;

public class Result {
    private Double x1;
    private Double x2;
    private String message;
    public Result(Double x1, Double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    public void print() {
        if (this.x1 == null && this.x2 == null) {
            System.out.println(" " + this.getMessage());
            return;
        }
        System.out.println("x1 = " + this.x1);
        System.out.println("x2 = " + this.x2);
        
    }
    public Double getX1() {
        return x1;
    }
    public void setX1(Double x1) {
        this.x1 = x1;
    }
    public Double getX2() {
        return x2;
    }
    public void setX2(Double x2) {
        this.x2 = x2;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
}
