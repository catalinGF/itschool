package com.itschool.session8.homework.challenge15;

//15. Toggling Case
//Description: Design a program using StringBuilder that toggles the case of every character in a given string. For example, "HelLo" should become "hELlO".

import java.util.Scanner;

public class TogglingCase {
    public static void main(String[] args) {
        togglingDemo();
    }

    static void togglingDemo() {
        //enter the string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();
        //create a new string to manipulate
        StringBuilder toggled = new StringBuilder();

        //iterate the input string to find each char and append it to new string.
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c)); //if is upper append to toggled string as lower case
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c)); //if is lower append to toggled as upper case
            } else {
                toggled.append(c); //append other chars
            }
        }
        System.out.println("The toggled string is:" + toggled);
    }
}
