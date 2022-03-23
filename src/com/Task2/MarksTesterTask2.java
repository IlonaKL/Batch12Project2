package com.Task2;

import java.text.DecimalFormat;

public class MarksTesterTask2 {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.00");

        A a=new A(11, 5, 3);
        System.out.println(f.format(a.getPercentage()));

        B b=new B(1, 2, 3, 5);
        System.out.println(f.format(b.getPercentage()));
    }
}
