package com.itschool.session14.hierarchicalinheritance;

public class SpeedBoat extends Boat{
    private int maxSpeed;
    private String engineType;

    public SpeedBoat(int length, int weight, int maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost(){
        System.out.println("Speed Boost");
    }
}
