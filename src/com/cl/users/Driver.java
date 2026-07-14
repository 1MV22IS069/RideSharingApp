package com.cl.users;

public class Driver {
    String name;
    String licNo;
    public Driver(String name,String licNo) {
        this.name = name;
        this.licNo=licNo;
    }
    public void acceptRide() {
        System.out.println(name +" with licenceNo: "+licNo+ " accepted the ride.");
    }

    public void rejectRide() {
        System.out.println(name +" with licenceNo: "+licNo+ " rejected the ride.");
    }
}