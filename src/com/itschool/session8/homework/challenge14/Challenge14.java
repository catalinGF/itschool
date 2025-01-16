package com.itschool.session8.homework.challenge14;

//14. Anagram Checker
//Description: Develop a program that checks if two provided strings are anagrams of each other using the StringBuilder class. Anagrams are words or phrases made up of the same characters.

import java.util.Arrays;
import java.util.Scanner;

public class Challenge14 {
    public static void main(String[] args) {
        anagramDemo();
    }

    static void anagramDemo() {
        //what is an anagram?
        //words of same length/same letters but other order
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String input1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String input2 = scanner.nextLine();

        StringBuilder rearrangestring1 = new StringBuilder();
        StringBuilder rearrangestring2 = new StringBuilder();

        if (areAnagrams(input1, input2)) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
    }

    static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
