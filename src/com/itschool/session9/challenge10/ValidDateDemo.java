package com.itschool.session9.challenge10;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidDateDemo {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date:");
        String dateInput = scanner.nextLine();

        boolean isValid = isValidDate(dateInput);
        System.out.println(isValid ? "true" : "false");
    }

    public static boolean isValidDate(String dateStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try{
            LocalDate d1 = LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeException e){
            return false;
        }
    }
}
