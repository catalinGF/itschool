package com.itschool.session7.course;

import java.util.Scanner;

public class AdvFlowControl {
    public static void main(String[] args) {
        // classicSwitch();
        enhancedSwitch();
    }

    static void enhancedSwitch() {
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        switch (age) {
            case 10 -> System.out.println("Age is 10");
            case 20 -> System.out.println("Age 20");
            case 30 -> System.out.println("Age 30");
            default -> System.out.println("Nothing entered");
        }
    }

    static void classicSwitch() {
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        switch (age) {
            case 10:
                System.out.println("Age is 10");
                break;
            case 20:
                System.out.println("Age 20");
                break;
            case 30:
                System.out.println("Age 30");
                break;
            default:
                System.out.println("Nothing entered");
        }
    }
}
