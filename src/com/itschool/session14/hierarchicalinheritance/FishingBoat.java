package com.itschool.session14.hierarchicalinheritance;

public class FishingBoat extends Boat{
    private int fishCapacity;
    private String typeOfNet;

    public FishingBoat(int length, int weight, int fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    void castNet(){
        System.out.println("Cast net");
    }
}
