package com.cl.vehicle;
import com.cl.interfaces.Chargeable;

public class Cab extends Vehicle implements Chargeable {
    public Cab(String number, String model, String color) {
        super(number, model,color);
    }
    @Override
    public double calculateFare(double distance) {
        return distance * 15;
    }
    @Override
    public void chargeBattery() {
        System.out.println("Cab battery charging");
    }
}