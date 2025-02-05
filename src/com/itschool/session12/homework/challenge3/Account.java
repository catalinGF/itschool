package com.itschool.session12.homework.challenge3;

import java.util.ArrayList;

public class Account {
    private String holderName;
    private double balance;
    private ArrayList<String> transactions;

    public Account(String holderName, double initialDeposit) {
        this.holderName = holderName;
        this.balance = initialDeposit;
        this.transactions = new ArrayList<>();
        transactions.add("Initial deposit:" + initialDeposit + ", Balance: " + balance);
    }

    //deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposit:" + amount + "New balance is: " + balance);
            System.out.println("Deposit:" + amount + "New balance is: " + balance);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    //withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            transactions.add("Withdraw: " + amount + "New balance is: " + balance);
            System.out.println("Withdraw: " + amount + "New balance is: " + balance);
            ;
        } else {
            System.out.println("Invalid withdraw");
        }
    }

    public void checkBalance() {
        System.out.println("Balance is:" + balance);
    }

    public void transactionList() {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
