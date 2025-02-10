package com.itschool.session15.challenge6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape myCircle = new Circle(55);
        Shape myRectangle = new Rectangle(3, 5);
        Shape mySquare = new Square(8);

        List<Shape> myList = new ArrayList<>();
        myList.add(myCircle);
        myList.add(myRectangle);
        myList.add(mySquare);

        for (Shape shape : myList) {
            System.out.println("Area for " + shape.getName() + " is: " + shape.area());
        }
    }
}
