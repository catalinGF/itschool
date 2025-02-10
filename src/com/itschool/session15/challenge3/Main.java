package com.itschool.session15.challenge3;

public class Main {
    public static void main(String[] args) {
        StudentA student1 = new StudentA(5, 7, 9);
        StudentB student2 = new StudentB(7, 8, 5, 9);

        System.out.println("Student 1: " + student1.getPercentage());
        System.out.println("Student 2: " + student2.getPercentage());
    }
}
