package com.cl.payments;

import com.cl.interfaces.PaymentGateway;
public class Wallet implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid :" + amount+"rs" + " using Wallet.");
    }
}