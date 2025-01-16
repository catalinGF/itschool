package com.itschool.session7.homework.challenge05;

import java.util.Scanner;

public class Challenge06 {
    public static void main(String[] args) {
        fibonaciDemo();
    }

    static void fibonaciDemo() {
        //what is fibonaci series: The Fibonacci sequence is the series of numbers where each number is the sum of the two preceding numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of fibonaci sequence");
        int fibonaciLength = scanner.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 0; i <= fibonaciLength; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.println("The series are: " + next);
        }

    }
}
