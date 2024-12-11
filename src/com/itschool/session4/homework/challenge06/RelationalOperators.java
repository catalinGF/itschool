package com.itschool.session4.homework.challenge06;
import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args) {

        int lowerTarget = 1;
        int upperTarget = 100;
        Scanner scanner = new Scanner(System.in);

        //enter number 1
        System.out.println("Enter number 1:");
        int number1 = scanner.nextInt();
        //enter number 2
        System.out.println("Enter number 2:");
        int number2 = scanner.nextInt();

        if(number1> number2){
            System.out.println("1st number is greater than 2nd number");
        }else{
            System.out.println("1st number is smaller than 2nd number");
        }

        if (number1 >= lowerTarget && number1<=upperTarget){
            System.out.println("numarul este in intervalul 1 - 100");
        }else{
            System.out.println("Numarul este in afara intervalului");
        }
    }
}
