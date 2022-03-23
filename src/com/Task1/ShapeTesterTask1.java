package com.Task1;

public class ShapeTesterTask1 {
    public static void main(String[] args) {
        double a=5.0;


        Circle circle=new Circle();
        circle.calculateArea(a);
        circle.calculatePerimiter(a);

        Square square=new Square();
        square.calculateArea(a);
        square.calculatePerimiter(a);
    }
}
