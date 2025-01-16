package com.itschool.session8.homework.challenge18;
//18. Encode Strings with Run-Length Encoding (RLE)
//Description: Using StringBuilder, write a program that implements the Run-Length Encoding algorithm. For instance, the string "AAABBBCCDAA" would be encoded as "3A3B2C1D2A".

import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args) {
        encodeStringDemo();
    }

    static void encodeStringDemo() {
        // input the string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = scanner.nextLine();

        //declare the string encode with a function
        String encoded = runLength(input);

        System.out.println("Encoded string is " + encoded);
    }

    static String runLength(String input) {
        StringBuilder encoded = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }
        if (input.length() > 0) {
            encoded.append(count).append(input.charAt(input.length() - 1));
        }
        return encoded.toString();
    }
}
