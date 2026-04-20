package com;
public class Vehicle {
    private String brand;
    private String year;
    public Vehicle(String brand, String year) {
        this.brand = brand;
        this.year = year;
    }
    public void start() {
        System.out.println("Vehiculo arranca ");
    }
    public void stop() {
        System.out.println("Vehiculo para");
    }
}
