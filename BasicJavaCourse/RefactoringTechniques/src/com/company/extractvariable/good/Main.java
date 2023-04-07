package com.company.extractvariable.good;

import com.company.extractvariable.bad.Order;

public class Main {

    void printProductPrice(Order order){

        //1. precio total de los productos
        double quantityPrice = order.getPrice() * order.getQuantity();

        //2. descuento
        double offerPrice = order.getPrice() * order.getOffer();

        //3. precio final = precio total menos el descuento
        double finalPrice = quantityPrice - offerPrice;

        //4. calculo precio envio
        double shippingPrice = order.getShipping() * 2;

        //5. precio final
        System.out.println(finalPrice + shippingPrice);
    }
}
