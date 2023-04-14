package com.company.removeassign.bad;

public class Main {

    double calculateDiscount(Order order, double totalPrice){

        if (order == null || order.getPrice() == null) return totalPrice; // programacion defensiva

        if(order.getPrice() > 100)
            totalPrice += order.getPrice() + order.getOffer(); // sobreescribe totalPrice
        return  totalPrice;
    }
}
