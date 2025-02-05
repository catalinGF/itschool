package com.itschool.session12.homework.challenge4;

import java.util.Date;

public class Workout {
    private String name;
    Date date;
    int duration;
    double distance;
    double weightLifted;

    public Workout(String name, double weightLifted, double distance, int duration, Date date) {
        this.name = name;
        this.weightLifted = weightLifted;
        this.distance = distance;
        this.duration = duration;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", distance=" + distance +
                ", weightLifted=" + weightLifted +
                '}';
    }
}
