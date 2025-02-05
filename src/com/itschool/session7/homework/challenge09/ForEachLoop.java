package com.itschool.session7.homework.challenge09;

// 9. For-Each Loop
// Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.

public class ForEachLoop {
    public static void main(String[] args) {
        forEachLoop();
    }

    static void forEachLoop() {
        int[] numbers = {10, 15, 25, 34, 56, 57, 98, 103};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " Even");
            } else {
                System.out.println(number + " Odd");
            }
        }
    }
}
