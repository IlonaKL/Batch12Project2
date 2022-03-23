package com.Task3;

public class Car {
    double carPrice;
    String color;

    Car(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }

    double calculateSalePrice() {
        return carPrice;
    }
}
