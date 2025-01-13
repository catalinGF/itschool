package com.itschool.session7.homework.challenge06;

import java.util.Scanner;

public class Challenge06 {
    public static void main(String[] args) {
        enterNumber();
    }

    static void enterNumber() {
        int sum = 0;
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        //while is true
        while (number != -1) {
            sum += number;
            number = scanner.nextInt();
        }
        System.out.println("The sum (excluding -1) is:" + sum);
    }
}
