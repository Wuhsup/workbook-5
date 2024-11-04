package com.pluralsight.vehicle;

public class Hovercraft extends Vehicle{
    private boolean isAmphibious;

    public Hovercraft(String color, int cargoCapacity, int fuelCapacity, boolean isAmphibious) {
        super(color, cargoCapacity, fuelCapacity);
        this.isAmphibious = isAmphibious;
    }

    public boolean isAmphibious() {
        return isAmphibious;
    }

    public void setAmphibious(boolean amphibious) {
        isAmphibious = amphibious;
    }
}
