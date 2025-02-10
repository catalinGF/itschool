package com.itschool.session15.challenge6;

public class Circle extends Shape {
    protected int radix;

    public Circle( int radix) {
        super("Circle");
        this.radix = radix;
    }

    @Override
    public double area() {
        return Math.PI * radix * radix;
    }
}

