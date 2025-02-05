package com.itschool.session12.homework.challenge3;

import java.util.Scanner;

public class BankingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = scanner.nextLine();

        System.out.println("Enter initial deposit:");
        double initialDeposit = scanner.nextDouble();

        Account account1 = new Account(name, initialDeposit);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Transaction Summary\n5. Exit");
            System.out.println("Choose option:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    account1.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdraw amount:");
                    double withdrawAmount = scanner.nextDouble();
                    account1.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Check balance");
                    account1.checkBalance();
                case 4:
                    System.out.println("Transaction summary");
                    account1.transactionList();
                    break;
                case 5:
                    System.out.println("Thank you banking with us");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invqlid choice");
            }
        }
    }
}
