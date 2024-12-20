package com.itschool.session6.homework.challenge05;

public class Challenge05 {
    public static void main(String[] args) {
        forLoop();
        printEvenNumbers();
    }

    static void forLoop() {
        for (int i=1; i<=10; i++ ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printEvenNumbers () {
        System.out.print("Even numbers from 1 to 10 are: ");
        for (int i=1; i<=10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " " );
            }
        }
    }
}
