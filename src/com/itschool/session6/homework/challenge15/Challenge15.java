package com.itschool.session6.homework.challenge15;

import java.util.Scanner;

public class Challenge15 {
    public static void main(String[] args) {
        authDemo();
    }

    static void authDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User exists? ");
        boolean hasUsername = scanner.nextBoolean();
        System.out.println("Password exists?");
        boolean hasPassword = scanner.nextBoolean();

        //check authentication conditions
        if (hasPassword && hasUsername) {
            System.out.println("Authentication successfull");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        } else {
            System.out.println("Authentication Failed");
        }
    }
}
