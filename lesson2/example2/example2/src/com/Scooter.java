package com;

public class Scooter extends Vehicle{
    private Boolean hasSideCard;
    public Scooter(String brand, String year, Boolean hasSideCard) {
        super(brand, year);
        this.hasSideCard = hasSideCard;
    }

}
