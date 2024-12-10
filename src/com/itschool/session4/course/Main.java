package com.itschool.session4.course;

public class Main {

    public static void main(String[] args) {
        // initialize a variable
        int  x = 3;
        int  y = ++x * 5 / x-- + --x;
        System.out.println("x is" + x);
        System.out.println("y is" + y);
    }
}
