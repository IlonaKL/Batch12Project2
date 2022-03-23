package com.Task3;

public class CarTesterTask3 {
    public static void main(String[] args) {
        Sedan car=new Sedan(2000.0,"white", 300.0);
        System.out.println("Car price = "+car.calculateSalePrice());

        Truck truck=new Truck(10000.0, "black", 80000);
        System.out.println("Car price = "+truck.calculateSalePrice());
    }
}
