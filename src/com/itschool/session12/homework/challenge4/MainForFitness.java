package com.itschool.session12.homework.challenge4;

import java.util.Date;

public class MainForFitness {
    public static void main(String[] args) {
        User user = new User("Johnny");
        user.logWorkout(new Workout("Run", 0, 30.66, 5, new Date()));
        user.logWorkout(new Workout("Yoga", 0 , 55.77, 6, new Date()));

        System.out.println("Workouts for" + user.getName());
        user.displayWorkouts();
    }
}
