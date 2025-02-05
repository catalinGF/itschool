package com.itschool.session12.homework.challenge4;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    List<Workout> workouts;

    public User(String name) {
        this.name = name;
        this.workouts = new ArrayList<>();
    }

    public void logWorkout(Workout workout){
        workouts.add(workout);
    }
    public void displayWorkouts(){
        for(Workout workout : workouts){
            System.out.println(workout);
        }
    }

    public String getName() {
        return name;
    }
}
