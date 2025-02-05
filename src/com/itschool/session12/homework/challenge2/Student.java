package com.itschool.session12.homework.challenge2;

import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Double> grades;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void addGrade(double grade){
        grades.add(grade);
    }
    public double getAgerage(){
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }
}
