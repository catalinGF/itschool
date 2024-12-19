package com.itschool.session6.homework.challenge02;

public class Challenge02 {

    public static void main(String[] args) {
        equalIntCheck();
        equalStringCheck();
}

static void equalIntCheck(){
    int firstNumber = 5;
    int secondNumber = 7;

    if (firstNumber == secondNumber) {
        System.out.println("Numbers are equal");
    } else {
        System.out.println("The numbers are not equal");
    }
}

static void equalStringCheck() {
        String firstString = "Georgescu";
        String secondString = "Georgescu";

        if (firstString.equals(secondString)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("Teh strings are not equal");
        }
}

}

