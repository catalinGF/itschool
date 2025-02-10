package com.itschool.session15.challenge6;

public class Rectangle extends Shape{
    protected final int length;
    protected final int width;
    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
