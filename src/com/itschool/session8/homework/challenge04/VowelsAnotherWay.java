package com.itschool.session8.homework.challenge04;

import java.util.Scanner;

public class VowelsAnotherWay {
    public static void main(String[] args) {
        checkVowels();
    }

    static void checkVowels() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();

        // declare the vowels
        String vowels = "aeiouAEIOU";

        //create a new string to manipulate
        StringBuilder newstring = new StringBuilder();

        //itarate to input string
        for (char c : input.toCharArray()) {
            if(vowels.indexOf(c) == -1) {
                newstring.append(c);
            }
        }
        System.out.println("The new string is:" + newstring);
    }
}
