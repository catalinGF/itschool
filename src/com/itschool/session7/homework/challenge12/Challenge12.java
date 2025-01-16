package com.itschool.session7.homework.challenge12;

import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {
        continueDemo();
    }

    static void continueDemo() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            int number = scanner.nextInt();
            if (number <= 5) {
                continue;
            }
            sum += number;
        }
        System.out.println("Teh sum is:" + sum);
    }
}
