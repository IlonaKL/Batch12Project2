package com.Task2;

public class B extends Marks {
    int grade4;

    B(int grade1, int grade2, int grade3, int grade4) {
        super(grade1, grade2, grade3);
        this.grade4=grade4;
    }

    @Override
    double getPercentage() {
        return (grade1+grade2+grade3+grade4)/4d;
    }
}
