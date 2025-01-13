package com.itschool.session7.homework.challenge07;

//Create a program where the user is prompted to guess a predefined number.
// After each guess, the program should inform the user if the guess is too high or too low.
// The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        guessNumber();
    }

    static void guessNumber() {
        int misteryNumber = 77;
        int enteredNumber;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your number");
            enteredNumber = scanner.nextInt();
            if (enteredNumber > misteryNumber) {
                System.out.println("The entered number is too high");
            } else if (enteredNumber < misteryNumber) {
                System.out.println("The entered number is too low");
            }

        } while (enteredNumber != misteryNumber);
        System.out.println("Bingo! You have guessed the number");
    }
}
