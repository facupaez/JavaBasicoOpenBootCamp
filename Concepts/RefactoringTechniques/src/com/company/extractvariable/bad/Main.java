package com.company.extractvariable.bad;

public class Main {

    void printProductPrice(Order order){
        // recomendacion extraer calculos a variables
        double totalPrice = order.getPrice() * order.getQuantity() - order.getOffer() + order.getShipping() * 2;

        System.out.println(totalPrice);
    }
}
