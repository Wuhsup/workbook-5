package com.pluralsight.vehicle;

public class Vehicle {

    private String color;
    private int numOfPass;
    private int cargoCapacity;
    private int fuelCapacity;


    public String getColor() {
        return color;
    }

    public int getNumOfPass() {
        return numOfPass;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumOfPass(int numOfPass) {
        this.numOfPass = numOfPass;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
