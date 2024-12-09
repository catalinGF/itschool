package com.itschool.session4.homework.challenge03;

import java.util.Scanner;
public class LogicalOperators {

    public static void main(String[] args) {
        //creaza un nou obiect  Scanner
        Scanner obiecScaner = new Scanner(System.in);


        // Prompt pentru introducere numar
        System.out.println("Introduceti primul numar");
        int numar1 = obiecScaner.nextInt();

        boolean isPositive = !(numar1<0);

        if(isPositive){
            System.out.println("Numarul este pozitiv");
        } else{
            System.out.println("Numarul este negativ");
        }

        obiecScaner.close();
    }
}
