package com.itschool.session14.multilevelinheritance;

public class ElectricCar extends Car{
    private int batteryCapacity, range;

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public void charge() {
        System.out.println("Charging the electric car...");
    }
}
