package com.itschool.session6.homework.challenge15;

public class Challenge15 {
    public static void main(String[] args) {
        authDemo();
    }
    static void authDemo() {
        boolean hasUsername = true;
        boolean hasPassword = false;

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
