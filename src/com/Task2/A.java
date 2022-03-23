package com.Task2;

public class A extends Marks {

    A(int grade1, int grade2, int grade3){
        super(grade1, grade2, grade3);
    }

    @Override
    double getPercentage() {
        return (grade1+grade2+grade3)/3d;
    }
}
