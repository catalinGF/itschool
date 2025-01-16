package com.itschool.session8.homework.challenge01;

//1. Reverse a String
//Description: Use the StringBuilder class to write a program that reverses an input string. For example, the input "hello" should return "olleh".

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        reversedStringDemo();
    }

    static void reversedStringDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to reverse:");
        String string1 = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder(string1);
        reversedString.reverse();
        System.out.println("The reversed string is:" + reversedString);
    }
}
