package com.itschool.session4.homework.challenge01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initializeaza un nou scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Introdu primul numar");
        int numar1 = input.nextInt();
        System.out.println("Introdu al doile numar");
        int numar2 = input.nextInt();

        //Adunarea
        int adunare = numar1 + numar2;
        System.out.println("Rezultatul adunarii este " + adunare);

        //Inmultire
        double inmultire = numar1 * numar2;
        System.out.println("Rezultatul inmultirii este " + inmultire);
        //Impartirea
        double impartire = numar1 / numar2;
        System.out.println("Rezultatul impartirii este " + impartire);

        //Modulo
        //Impartirea
        double modulo = numar1 % numar2;
        System.out.println("Rezultatul restului este " + modulo);
    }
}
