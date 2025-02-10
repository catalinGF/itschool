package com.itschool.session14.multilevelinheritance;

public final class Tesla extends ElectricCar {
    private int autopilotVersion;

    public Tesla(String make, String model, int year, int batteryCapacity, int range, int autopilotVersion) {
        super(make, model, year, batteryCapacity, range);
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot() {
        System.out.println("Autopilot enabled: Version " + autopilotVersion);
    }
}
