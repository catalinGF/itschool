package com.itschool.session15.challenge6;

public abstract class Shape {
    private String name;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();
}
