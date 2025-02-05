package com.itschool.session9.challenge9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DayDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date 1:");
        String date1 = scanner.nextLine();
        System.out.println("Enter date 2:");
        String date2 = scanner.nextLine();

        System.out.println("Days between:" + daysBetween(date1, date2));
    }

    public static long daysBetween(String date1, String date2) {
        //set format of date
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd");

        //declare variables
        LocalDate d1 = LocalDate.parse(date1, dateTimeFormatter);
        LocalDate d2 = LocalDate.parse(date2, dateTimeFormatter);
        return Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}
