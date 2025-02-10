package com.itschool.session14.singleinheritance;

public class MountainBike extends Bicycle{
    private String tireType;
    private boolean suspension;

    public MountainBike(int speed, int gear, String tireType, boolean suspension) {
        super(speed, gear);
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public void adjustSuspenssion(boolean newSuspenssion) {
        suspension = newSuspenssion;
        System.out.println("Suspenssion adjusted:" + (suspension ? "Enabled" : "Disabled"));
    }

    public void changeGear(int newGear, String gearType){
        int gear = newGear;
        String tireType = gearType;
        System.out.println("Change gear:" + newGear + ", tire type: " + gearType);

    }
}
