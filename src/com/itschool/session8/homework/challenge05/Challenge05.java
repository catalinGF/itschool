package com.itschool.session8.homework.challenge05;

//5. Word Capitalizer
//Description: Write a program that capitalizes the first letter of every word in a sentence using the StringBuilder class.

import java.util.Scanner;

public class Challenge05 {
    public static void main(String[] args) {
        capitalizeSentence();
    }

    static void capitalizeSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input = scanner.nextLine();
        //split sentence into words
        String[] words = input.split(" ");

        //ini an empty string for result
        StringBuilder capitalizedSentence = new StringBuilder();

        //loop through each word
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        System.out.println("The capitalized sentence is:" + capitalizedSentence.toString().trim());
    }
}
