package com.itschool.session15.challenge2;

public class Main {
    public static void main(String[] args) {
        Bank deposit1 = new BankA();
        Bank deposit2 = new BankB();
        Bank deposit3 = new BankC();

        deposit1.getBalance();
        deposit2.getBalance();
        deposit3.getBalance();
        }
    }
