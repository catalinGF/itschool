package com.itschool.session7.homework.challenge11;

import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        breakStatements();
    }

    static void breakStatements() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter the numbers to calculate the average(enter 0 to stop):");
        while (true) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is:" + average);
        } else {
            System.out.println("No numbers entered");
        }

    }
}
