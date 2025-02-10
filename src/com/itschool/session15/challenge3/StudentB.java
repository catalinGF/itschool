package com.itschool.session15.challenge3;

public class StudentB extends  Marks{
    private int mark1, mark2, mark3, mark4;

    public StudentB(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    public double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4;
    }
}
