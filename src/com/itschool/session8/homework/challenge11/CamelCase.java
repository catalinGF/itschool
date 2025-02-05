package com.itschool.session8.homework.challenge11;

//11. CamelCase to Snake_case Converter
//Description: Write a program using StringBuilder to convert a given CamelCase string to snake_case. For instance, "thisIsCamelCase" would become "this_is_camel_case".

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        camelCaseDemo();
    }

    static void camelCaseDemo() {
        //enter the string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        //find where an uppercase is located.Define an array of the input
        char[] chars = input.toCharArray();
        System.out.print("The array is: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }

        //before that upperCase insert an underscore. Create e new string to manipulate
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                result.append("_").append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        //return the result
        System.out.println("The result is: " + result);
    }

}
