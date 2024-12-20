package com.itschool.session6.homework.challenge04;

import java.util.Scanner;

public class Challenge04 {
    public static void main(String[] args) {
        checkEqual();
    }
    static void checkEqual() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Height 1:");
        int heightOne = scanner.nextInt();

        System.out.println("Enter the Heght 2:");
        int heightTwo = scanner.nextInt();

        String message = (heightOne > heightTwo) ? "Height 1 is greater" : "Height two is greater";
        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;
        System.out.println(message + "which is " + maximumHeight);
    }
}
