package com.cl.vehicle;


public class Auto extends Vehicle {
    public Auto(String number, String model,String color) {
        super(number, model,color);
    }
    @Override
    public double calculateFare(double distance) {
        return distance * 10;
    }
}
