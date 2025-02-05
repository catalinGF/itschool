package com.itschool.session8.homework.challenge08;

//8. Inserting at Index
//Description: Write a Java program that inserts a given string into another string at a specified index using the StringBuilder class.

import java.util.Scanner;

public class Challenge08 {
    public static void main(String[] args) {
        insertString();
    }

    static void insertString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String original = scanner.nextLine();
        System.out.println("The length is:" + original.length());

        System.out.println("Enter string to insert:");
        String toInsert = scanner.nextLine();

        System.out.println("Position index:");
        int indexPosition = scanner.nextInt();


        //vlaidate index
        if (indexPosition < 0 || indexPosition > original.length()) {
            System.out.println("Index out of range. Please insert between 0 and: " + original.length());
        } else {
            StringBuilder result = new StringBuilder(original);
            result.insert(indexPosition, toInsert);
            System.out.println("Modified string:" + result.toString());
        }
    }
}
