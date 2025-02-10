package com.itschool.session14.multilevelinheritance;

public class ElectricCar extends Car{
    private int batteryCapacity;
    private int range;

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public void charge() {
        System.out.println("Charging the electric car..." + getMake() + " " + getModel() + "...");
        if (batteryCapacity < 100) {
            System.out.println("Current battery capacity is " + ++batteryCapacity); // increment percentage
            System.out.println("Current range: " + (range += 10)); // grow the range with 10 km.
        } else {
            System.out.println("Battery fully charged. Range: " + range);
        }
    }
}
