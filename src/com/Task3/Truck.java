package com.Task3;

public class Truck extends Car{
    int weight;

    Truck(double carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    double calculateSalePrice(){
        if (weight>2000){
            System.out.println("Discount 10%");
            return carPrice*0.9;
        }
        else{
            System.out.println("Discount 20%");
            return carPrice*0.8;
        }
    }
}
