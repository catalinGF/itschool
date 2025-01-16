package com.itschool.session8.homework.challenge04;

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        checkVowels();
    }

    static void checkVowels() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string1 = scanner.nextLine();

        // declare vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        //create a string fornext actions
        StringBuilder result = new StringBuilder();
        for (char c : string1.toCharArray()) {
            boolean isVowel = false;
            for (char vowel : vowels) {
                if (c == vowel) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel) {
                result.append(c);
            }
        }
        System.out.println("String without vowels: " + result);
    }
}
