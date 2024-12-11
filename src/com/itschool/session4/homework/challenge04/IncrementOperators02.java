package com.itschool.session4.homework.challenge04;

public class IncrementOperators02 {

    public static void main(String[] args) {
            int x = 25;
            int y = ++x + 8 / x-- * --x;

            //Afiseaza rezultat
            System.out.println("x este" + x);
            System.out.println("y este" + y);
    }
}
