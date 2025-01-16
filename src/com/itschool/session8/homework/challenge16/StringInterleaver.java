package com.itschool.session8.homework.challenge16;

import java.util.Scanner;

//16. String Interleaver
//Description: Write a program using StringBuilder that interleaves two strings. For instance, given "abc" and "123", the result should be "a1b2c3".
public class StringInterleaver {
    public static void main(String[] args) {
        stringInterLeaver();
    }

    static void stringInterLeaver() {
        //input strings
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String input1 = scanner.nextLine();
        System.out.println("Enter second string");
        String input2 = scanner.nextLine();

        //create a new string for manipulation
        StringBuilder interleaved = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < input1.length() || j < input2.length()) {
            // if i is lower than length of input append the char to string
            if (i < input1.length()) {
                interleaved.append(input1.charAt(i));
                i++;
            }
            if (j < input2.length()) {
                interleaved.append(input2.charAt(j));
                j++;
            }
        }
        System.out.println("The final string is:" + interleaved.toString());
    }
}
