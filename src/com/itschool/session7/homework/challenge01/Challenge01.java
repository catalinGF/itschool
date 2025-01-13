package com.itschool.session7.homework.challenge01;

import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) {
        evenOddDemo();
    }

    static void evenOddDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}
