package com.itschool.session7.homework.challenge04;

import java.util.Scanner;

public class Challenge04 {
    public static void main(String[] args) {
        reverseString();
    }
    static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String reversed ="";
        for (int i =input.length() - 1; i>=0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed string is:" + reversed);
    }
}
