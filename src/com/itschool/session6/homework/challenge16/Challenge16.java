package com.itschool.session6.homework.challenge16;

import java.util.Scanner;

public class Challenge16 {
    public static void main(String[] args) {
        scoreDemo();
    }
    static void scoreDemo() {
        Scanner scanner = new Scanner(System.in);

        //enter the score of the student
        System.out.println("Enter the student's score:");
        double score = scanner.nextDouble();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade: D");
        } else if (score >= 0 && score < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
        }

        scanner.close();
    }
}
