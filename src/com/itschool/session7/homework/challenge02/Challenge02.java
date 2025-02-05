package com.itschool.session7.homework.challenge02;

import java.util.Scanner;

public class Challenge02 {
    public static void main(String[] args) {
        //monthFinderClassicSwitch();
        monthFinderWithArray();
    }

    static void monthFinderClassicSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("You selected January");
                break;
            case 2:
                System.out.println("You selected February");
                break;
            case 3:
                System.out.println("You selected March");
                break;
            case 4:
                System.out.println("You selected April");
                break;
            case 5:
                System.out.println("You selected May");
                break;
            case 6:
                System.out.println("You selected June");
                break;
            case 7:
                System.out.println("You selected July");
                break;
            case 8:
                System.out.println("You selected August");
                break;
            case 9:
                System.out.println("You selected September");
                break;
            case 10:
                System.out.println("You selected October");
                break;
            case 11:
                System.out.println("You selected November");
                break;
            case 12:
                System.out.println("You selected December");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }

    static void monthFinderWithArray() {
        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int monthNumber = scanner.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("The selected month is " + months[monthNumber - 1]);
        } else {
            System.out.println("The month is invalid");
        }
        scanner.close();
    }
}
