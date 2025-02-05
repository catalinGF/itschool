package com.itschool.recap;

import java.util.Scanner;

public class Recap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1st input");
        int a = scanner.nextInt();
        System.out.println("2nd input");
        int b = scanner.nextInt();

        long result = (long) a * b;
        System.out.println(result);
    }
}
