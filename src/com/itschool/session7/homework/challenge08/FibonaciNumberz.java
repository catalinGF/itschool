package com.itschool.session7.homework.challenge08;

//8. For Loop
//Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.
public class FibonaciNumberz {
    public static void main(String[] args) {
        fibonaciNumberz();
    }

    static void fibonaciNumberz() {
        int fibonaciLength = 10;
        int first = 0;
        int second = 1;
        for (int i = 0; i < fibonaciLength; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.println("Fibonaci:" + next);
        }
    }
}
