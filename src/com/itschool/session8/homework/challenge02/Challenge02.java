package com.itschool.session8.homework.challenge02;

//. Palindrome Checker
//Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
// A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.

import java.util.Scanner;

public class Challenge02 {
    public static void main(String[] args) {
        palindormeDemo();
    }

    static void palindormeDemo() {
        //enter the string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string1 = scanner.nextLine();
        //convert string to lower case
        String toLowerCase = string1.toLowerCase();
        System.out.println("LowerCase string is:" + toLowerCase);
        //build string reversed
        StringBuilder reversedString = new StringBuilder(toLowerCase).reverse();
        //compare string
        if (toLowerCase.equals(reversedString.toString())) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
