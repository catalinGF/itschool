package com.itschool.session8.homework.challenge09;

//9. Frequency Counter
//Description: Using StringBuilder, write a program that counts the frequency of each character in a string.

import java.util.Arrays;
import java.util.Scanner;

public class FreqChar {
    public static void main(String[] args) {
        freqCharDemo();
    }

    static void freqCharDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        //split string to an array
        int[] freq = new int[256];
        System.out.println("Freq array:" + Arrays.stream(freq).toArray());  //display for understand purpose

        //loop through and count
        for (char c : input.toCharArray()) {
            freq[c]++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result.append((char) i).append(": ").append(freq[i]).append("\n");
            }
        }

        System.out.println("Character Frequencies:");
        System.out.println(result);
    }
}
