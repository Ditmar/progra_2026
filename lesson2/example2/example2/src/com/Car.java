package com;

public class Car extends Vehicle{
    private Integer numberDoors;
    public Car(String branch, String year, Integer numberDoors) {
        super(branch, year);
        this.numberDoors = numberDoors;
    }
    public void openBox() {
        System.out.println("it is open box ");
    }
    public Integer getNumberDoors() {
        return this.numberDoors;
    }
}
