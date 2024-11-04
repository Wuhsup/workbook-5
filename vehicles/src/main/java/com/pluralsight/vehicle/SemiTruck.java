package com.pluralsight.vehicle;

public class SemiTruck extends Vehicle{
    private int maxLoadWeight;

    public SemiTruck(String color, int cargoCapacity, int fuelCapacity, int maxLoadWeight) {
        super(color, cargoCapacity, fuelCapacity);
        this.maxLoadWeight = maxLoadWeight;
    }

    public int getMaxLoadWeight() {
        return maxLoadWeight;
    }

    public void setMaxLoadWeight(int maxLoadWeight) {
        this.maxLoadWeight = maxLoadWeight;
    }
}
