package com.pluralsight.vehicle;

public class Moped extends Vehicle{
    private boolean hasHelmet;


    public Moped(String color, int cargoCapacity, int fuelCapacity, boolean hasHelmet) {
        super(color, cargoCapacity, fuelCapacity);
        this.hasHelmet = hasHelmet;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

}


