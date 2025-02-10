package com.itschool.session14.multilevelinheritance;

public class Main {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla("Tesla", "Model X", 2022, 100, 500, 11);

        myTesla.enableAutopilot();
        myTesla.start();
        myTesla.accelerate();
        myTesla.charge();
        myTesla.stop();
    }
}
