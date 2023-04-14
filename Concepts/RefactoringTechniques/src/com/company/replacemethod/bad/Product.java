package com.company.replacemethod.bad;

public class Product {

    double price;
    int quantity;
    double discount;
    double shipping;

    // constructores

    // metodos

    // toString

    public double calculatePrice(){
        double result = 0;
        double priceQuantity = this.price * this.quantity;
        double priceDiscount = this.price * this.discount;
        double priceShipping = shipping * 0.50;

        return  result;
    }

    // getters and setters
}
