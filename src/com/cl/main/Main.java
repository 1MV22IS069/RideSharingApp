package com.cl.main;

import com.cl.payments.UPI;
import com.cl.users.Customer;
import com.cl.users.Driver;
import com.cl.vehicle.Bike;
import com.cl.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Adam","adam@gmail.com","123");
        Driver driver = new Driver("Ramesh","Dl12");

        customer.bookRide();
        driver.acceptRide();

        Bike vehicle = new Bike("KA01AB1234", "Electric Bike","White");

        vehicle.startRide();

        double fare = vehicle.calculateFare(10);

        vehicle.endRide();

        System.out.println("Fare =" + fare+"rs");

        customer.payOnline(new UPI(), fare);
    }
}
