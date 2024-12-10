package com.itschool.session4.homework.challenge02;
import java.util.Scanner;

public class ReverseSign {
    public static void main(String[] args) {

        //creaza un nou obiect scanner
        Scanner scanner = new Scanner(System.in);

        //Afiseza promptul
        System.out.println("Introdu numarul:");
        int numar1 = scanner.nextInt();

        //Afiseaza numarul cu minus
        int semnMinus = -numar1;
        System.out.println("Numarul negativ este:"+ semnMinus);
    }
}
