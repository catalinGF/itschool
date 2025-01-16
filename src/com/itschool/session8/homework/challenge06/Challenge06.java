package com.itschool.session8.homework.challenge06;

//6. String Replacement
//Description: Use the StringBuilder class to replace every occurrence of a substring within a given string with another substring.
// For instance, replace "cat" with "dog" in the string "The cat sat on the mat."

import java.util.Scanner;

public class Challenge06 {
    public static void main(String[] args) {
        replaceString();
    }

    static void replaceString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String input = scanner.nextLine();

        System.out.println("Enter the word to be replaced");
        String wordToChange = scanner.nextLine();

        System.out.println("Enter the replacement string");
        String replacementString = scanner.nextLine();

        //init an empty sentence
        StringBuilder newsentence = new StringBuilder(input);

        //find index of wordtoChange
        int index = newsentence.indexOf(wordToChange);
        while (index != -1) {
            newsentence.replace(index, index + wordToChange.length(), replacementString);
            index = newsentence.indexOf(wordToChange, index + replacementString.length());
        }
        System.out.println("Modified string:" + newsentence);
    }
}
