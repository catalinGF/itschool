package com.itschool.session12.homework.challenge2;

public class Gradebook {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Johny");
        Student student1 = new Student("Billy", 1);
        Student student2 = new Student("Ken", 2);

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);

        teacher1.assignGrade(1, 85);
        teacher1.assignGrade(1, 90);
        teacher1.assignGrade(2, 77);
        teacher1.assignGrade(2, 88);

        teacher1.printGradeBook();
    }
}
