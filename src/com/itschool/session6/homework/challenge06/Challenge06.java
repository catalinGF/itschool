package com.itschool.session6.homework.challenge06;

import java.util.Scanner;

public class Challenge06 {
    public static void main(String[] args) {
        temperatureCheck();
    }
    static void temperatureCheck() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature:");
        int temperature = scanner.nextInt();

        if ( temperature > 30) {
            System.out.println("Is Hot");
        } else if ( temperature >= 20 && temperature <= 30) {
            System.out.println("Is Warm");
        } else {
            System.out.println("Is Cold");
        }
    }
}
