package com.cl.vehicle;
import com.cl.interfaces.Chargeable;

public class Bike extends Vehicle implements Chargeable {
    public Bike(String number, String model, String color) {
        super(number, model,color);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 5;
    }

    @Override
    public void chargeBattery() {
        System.out.println("Bike battery charging");
    }
}