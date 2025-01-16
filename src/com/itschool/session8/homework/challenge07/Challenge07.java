package com.itschool.session8.homework.challenge07;

//7. Duplicate Character Remover
//Description: Design a program using StringBuilder that removes duplicate characters from a string. For example, "balloon" should become "balon".

import java.util.Scanner;

public class Challenge07 {
    public static void main(String[] args) {
        duplicateRemover();
    }

    static void duplicateRemover() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        //init string
        StringBuilder result = new StringBuilder();

        //ascii chars
        boolean[] seen = new boolean[256]; //extnded ASCII chars - I read about this how to use all chars table in an Array.

        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        System.out.println("The result is:" + result);
    }
}
