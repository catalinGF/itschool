package com.itschool.session6.homework.challenge09;

public class Challenge09 {
    public static void main(String[] args) {
        stringEquals();
    }
    static void stringEquals() {
        String countryOne = "USA";
        String countryTwo = "UK";
        if (countryOne.equals(countryTwo)) {
            System.out.println("Countries are the same");
        } else {
            System.out.println("Countries are different");
        }
    }
}
