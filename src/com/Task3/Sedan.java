package com.Task3;

public class Sedan extends Car{
    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    double calculateSalePrice(){
        if(length>20){
            System.out.println("Discount 5%");
            return carPrice*0.95;
        }
        else{
            System.out.println("Discount 10%");
            return carPrice*0.9;
        }
    }
}
