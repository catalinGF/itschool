package com.itschool.session12.homework.challenge1;

public class MainSystem {
    public static void main(String[] args) {
        College college = new College();

        //add students
        Professor profBen = new Professor("Ben", "Doe", 35, "M","1990-02-30", "1222333333", "NY");
        college.addProfessor(profBen);

        //add course
        Course course1 = new Course("Computers","March","Testing", 12);
        course1.assignProfessor(profBen);
        college.addCourse(course1);

        college.displayCourses();
    }
}
