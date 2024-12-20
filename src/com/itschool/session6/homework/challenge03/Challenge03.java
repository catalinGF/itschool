package com.itschool.session6.homework.challenge03;

import java.util.Scanner;

public class Challenge03 {
    public static void main(String[] args) {
        checkAge();
    }

    static void checkAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // check if the age is above 18
        String message = (age >= 18) ? "Your are an adult" : "You are a child";
        System.out.println(message);
    }
}
