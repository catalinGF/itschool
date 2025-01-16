package com.itschool.session8.homework.challenge12;

//12. Expand Compressed Strings
//Description: Given a compressed string like "a3b2c4", expand it to "aaabbcccc", making use of the StringBuilder class.

import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args) {

    }

    static void expandDemo() {
        //enter the initial string
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a new string:");
        String input = scanner.nextLine();

        //declare an empty string to construct
        StringBuilder newstring = new StringBuilder();
        //find if a char is number or letter.. Thinking loud ”I have to do 1k more java exercises like this to be fluid and do it without inspiration” :)
        for(int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)){
                int j = i+1;
                StringBuilder numberBuilder = new StringBuilder();
                while (j < input.length() && Character.isDigit(input.charAt(j)))numberBuilder.append(input.charAt(j));
                j++;
            }
        }
    }
}
