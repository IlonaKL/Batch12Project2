package com.Task2;

public abstract class Marks {
    int grade1;
    int grade2;
    int grade3;
    Marks (int grade1, int grade2, int grade3){
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
    }
    abstract double getPercentage();
}
