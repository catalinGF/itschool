package com.itschool.session14.singleinheritance;

public class Bicycle {
    protected int speed;
    protected int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void changeGear(int newGear){
        gear = newGear;
        System.out.println("Change Gear" + gear);
    }
    public void speedUP(int increment){
        speed += increment;
        System.out.println("Speed is incrised " + speed);
    }

    public void applyBrake(int decrement){
        speed -= decrement;
        System.out.println("Speed is:" + speed);
    }
}
