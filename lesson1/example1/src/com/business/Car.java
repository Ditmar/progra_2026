package com.business;

public class Car {
    private String brand;
    private String model;
    private Integer velocity;
    public Car(String brand, String model, Integer velocity) {
        this.brand = brand;
        this.model = model;
        this.velocity = velocity;
    }
    public void accelerate(Integer increment) {
        this.velocity += increment;
    }
    public void showInfo() {
        System.out.println("Modelo : " + this.model);
        System.out.println("Marca : " + this.brand);
        System.out.println("Velocidad "  + this.velocity);
    }
}
