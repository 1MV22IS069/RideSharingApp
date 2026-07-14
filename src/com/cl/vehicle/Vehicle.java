package com.cl.vehicle;


public abstract class Vehicle {
    String vehicleNumber;
    String model;
    String color;
    public Vehicle(String vehicleNumber, String model,String color) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.color=color;
    }
    public void startRide() {
        System.out.println("Vehicle: " + vehicleNumber + " model : " + model + " status: ride started.");
    }
    public void endRide() {
        System.out.println("Vehicle: " + vehicleNumber + " model : " + model + " status: ride ended.");
    }
    public abstract double calculateFare(double distance);
}
