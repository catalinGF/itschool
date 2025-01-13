package com.itschool.session7.homework.challenge10;

import java.util.Scanner;

public class Chellenge10 {
    public static void main(String[] args) {
        jumpStatements();
    }

    static void jumpStatements() {
        Scanner scanner = new Scanner(System.in);
        String userName = "";

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print \"Hello World\"");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    if (userName.isEmpty()) {
                        System.out.print("Enter your name: ");
                        userName = scanner.nextLine();
                    }
                    System.out.println("Your name is: " + userName);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue; // Go back to the menu
            }
        }
    }
}
