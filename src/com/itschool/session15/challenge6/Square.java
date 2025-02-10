package com.itschool.session15.challenge6;

public class Square extends Shape {
    protected final int side;

    public Square(int side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
