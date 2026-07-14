package com.cl.users;
import com.cl.interfaces.PaymentGateway;
public class Customer {
    String name;
    String email;
    String custId;
    public Customer(String name,String email, String custId) {
        this.name = name;
        this.email=email;
        this.custId=custId;
    }
    public void bookRide() {
        System.out.println(name +" with email: "+email+ " booked a ride.");
    }
    public void payOnline(PaymentGateway gateway, double amount) {
        gateway.pay(amount);
    }
}