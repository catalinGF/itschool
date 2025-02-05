package com.itschool.session9.challenge8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfWeekDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date:");
        String d1 = scanner.nextLine();
        System.out.println("The week day is:" + demoDayOfWeek(d1));
    }

    public static String demoDayOfWeek(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        return dayOfWeek.toString();
    }
}
