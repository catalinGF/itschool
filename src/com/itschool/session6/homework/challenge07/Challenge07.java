package com.itschool.session6.homework.challenge07;

import java.util.Scanner;

public class Challenge07 {
    public static void main(String[] args) {
        checkTriangleType();
    }
    static void checkTriangleType() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sideOne");
        int sideOne = scanner.nextInt();
        System.out.println("Enter sideTwo");
        int sideTwo = scanner.nextInt();
        System.out.println("Enter SideThree");
        int sideThree = scanner.nextInt();

        // Equilateral is when all 3 are equal
        //isosceles is when any of two sides are equal
        //no sides are equal
        if ( sideOne == sideTwo && sideTwo == sideThree) {
            System.out.println("Triangle is equilateral");
        } else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
            System.out.println("Triangle si isoscels");
        }else {
            System.out.println("The triangle is Scalene");
        }
    }
}
