package com.itschool.session14.multilevelinheritance;

public class Car {
    private final String make;
    private final String model;
    protected int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The care is starting");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
