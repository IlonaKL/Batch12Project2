package com.Task1;

import java.text.DecimalFormat;

public class Circle implements Shape{
    DecimalFormat f = new DecimalFormat("##.00");
    @Override
    public void calculateArea(double a) {
        System.out.println("Area of a Circle = "+ f.format(Math.PI*Math.pow(a,2)));
    }

    @Override
    public void calculatePerimiter(double a) {
        System.out.println("Circumference of a Circle = "+ f.format(Math.PI*2*a));
    }
}
