package com.itschool.session15.challenge1;

public class Main {
    public static void main(String[] args) {
        Notification firstDevice = new FirstDevice();
        Notification secondDevice = new SecondDevice();

        firstDevice.sendMessage();
        secondDevice.sendMessage();
    }
}
