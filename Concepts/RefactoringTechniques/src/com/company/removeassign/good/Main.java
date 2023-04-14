package com.company.removeassign.good;

import com.company.removeassign.bad.Order;

public class Main {

    double calculateDiscount(Order order, double totalPrice){

        // no modificamos el paramatetro recibido, en vez de ello creamos una copia y
        // la devolvemos al final de la funcion
        double result = totalPrice;
        if (order == null || order.getPrice() == null) return result; // programacion defensiva

        if(order.getPrice() > 100)
            result += order.getPrice() + order.getOffer(); // sobreescribe totalPrice

        return  result;
    }
}
