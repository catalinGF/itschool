package com.itschool.session4.homework.challenge04;

public class IncrementOperators01 {

    public static void main(String[] args) {
        // initialize a variable
        int  x = 8;
        int  y = ++x * 5 / x-- + --x;   // x are aceesi valoare si daca se pune x--

        // Afiseaza valoarile
        System.out.println("x is" + x);
        System.out.println("y is" + y);

    }
}


