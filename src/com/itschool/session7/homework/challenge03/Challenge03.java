package com.itschool.session7.homework.challenge03;

public class Challenge03 {
    public static void main(String[] args) {
        negativeNumbers();
    }

    static void negativeNumbers() {
        int[] numbers = {
                -7, -5, -3, -1, 0, 1, 5, 6
        };
        int negativeCount = 0;
        for (int number : numbers) {
            if (number < 0) {
                negativeCount++;
            }
        }
        System.out.println("The number of negative is" + negativeCount);
    }
}
