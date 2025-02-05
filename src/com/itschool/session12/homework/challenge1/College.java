package com.itschool.session12.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class College {
    private List<Student> students = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}

