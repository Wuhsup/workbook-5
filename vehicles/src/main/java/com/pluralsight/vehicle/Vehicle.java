package com.pluralsight.vehicle;

public class Vehicle {

    private String color;
    private int cargoCapacity;
    private int fuelCapacity;


    public Vehicle(String color, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor() {
        return color;
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

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
