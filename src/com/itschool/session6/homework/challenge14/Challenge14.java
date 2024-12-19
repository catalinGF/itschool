package com.itschool.session6.homework.challenge14;

public class Challenge14 {
    public static void main(String[] args) {
        compoundDemo();
    }
    static void compoundDemo() {
        int total = 100;

        total -=20;
        System.out.println("The value of total is: " + total);
        total *=2;
        System.out.println("The value of total after multiply by 2 is: " + total);
    }
}
