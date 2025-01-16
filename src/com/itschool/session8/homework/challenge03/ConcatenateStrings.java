package com.itschool.session8.homework.challenge03;

//3. Concatenate Multiple Strings
//Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.

import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        concatStrings();
    }

    static void concatStrings() {
        // enter number of strings
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of strings to concatenate:");
        int numberOfStrings = scanner.nextInt();
        scanner.nextLine();
        // concatenate strings
        StringBuilder concatString = new StringBuilder();

        // loop to get each string from the user
        for (int i = 1; i <= numberOfStrings; i++) {
            System.out.println("Enter string" + i + ":");
            String input = scanner.nextLine();
            concatString.append(input);
        }
        System.out.println("Concatenated string: " + concatString);
    }
}
