package com.itschool.session6.homework.challenge08;

import java.util.Scanner;

public class Challenge08 {
    public static void main(String[] args) {
        factorialNumber();
    }
    static void factorialNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        long factorial = 1;
        for ( int i = 1; i <= number; i++) {
            factorial *=i;
        }
        System.out.println("The factorial number is" + factorial);
    }
}
