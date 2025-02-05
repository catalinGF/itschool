package com.itschool.session12.homework.challenge1;

import java.util.List;

public class Course {
    private String name, schedule, description;
    private int duration;
    private Professor assignedProfessor;

    public Course(String name, String schedule, String description, int duration) {
        this.name = name;
        this.schedule = schedule;
        this.description = description;
        this.duration = duration;
    }

    public void assignProfessor(Professor professor){
        this.assignedProfessor = professor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", schedule='" + schedule + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", assignedProfessor=" + assignedProfessor +
                '}';
    }
}
