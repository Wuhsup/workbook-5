package com.pluralsight.vehicle;

public class Car extends Vehicle {
    private String engineType;

    public Car(String color, int cargoCapacity, int fuelCapacity, String engineType) {
        super(color, cargoCapacity, fuelCapacity);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
