package com.itschool.session14.hierarchicalinheritance;

public class Boat {
    private int length;
    private int weight;

    public Boat(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    public void sail(){
        System.out.println("Sailing");
    }
}
