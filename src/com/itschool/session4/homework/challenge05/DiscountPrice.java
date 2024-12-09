package com.itschool.session4.homework.challenge05;
import java.util.Scanner;
public class DiscountPrice {

    public static void main(String[] args) {

        // create new Scanner object
        Scanner scanner = new Scanner(System.in);

        //enter new price
        System.out.println("Enter the original price");
        double price = scanner.nextDouble();

    //enter the discount
        System.out.println("Enter the discount percentage");
        double discount = scanner.nextDouble();

        // amount of discount
        double amountDiscount = price * (discount/100);
        price -=amountDiscount; //original price minus discount amount

        //display result
        System.out.println("Price after discount is " + price);
    }

}
