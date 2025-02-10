package com.itschool.session15.challenge4;

public abstract class AbstractClass {
    AbstractClass() {
        System.out.println("This is constructor for abstract class");
    }

    public abstract void aMethod();

    public void normalMethod(){
        System.out.println("This is a normal method of abstract class");
    }
}
