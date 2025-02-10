package com.itschool.session14.singleinheritance;

public class Main {
    public static void main(String[] args) {
        MountainBike myBike = new MountainBike(55, 27, "Dunlop", true);
        myBike.speedUP(6);
        myBike.changeGear(4, "Dunlop");
        myBike.applyBrake(5);
        myBike.adjustSuspenssion(false);
    }
}
