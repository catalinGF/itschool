package com.itschool.session12.homework.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Student> students;

    public Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignGrade(int studentId, double grade) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                student.addGrade(grade);
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }
    public void printGradeBook(){
        System.out.println("Gradebook for" + name + "not found");
        for (Student student : students) {
            System.out.println("Student:" + student.getName() + " with ID: " + student.getStudentId() + ", average grade is: " + student.getAgerage());
        }
    }
}
