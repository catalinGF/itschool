package com.itschool.session12.homework.challenge1;

public class Professor {
    private String firstName, lastName, sex, dateOfBirth, CNP, address;
    private int age;

    public Professor (String firstName, String lastName, int age, String sex, String dateOfBirth, String CNP, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", CNP='" + CNP + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}

