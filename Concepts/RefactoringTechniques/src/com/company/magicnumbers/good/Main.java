package com.company.magicnumbers.good;

public class Main {

    // reemplazamos numeros hardcoded por variables constantes
    private static final double MINIMUN_PRICE = 100;
    private static final double SHIPPING_PRICE = 4.99;
    private static final double FREE_SHIPPING = 0;
    private static final double DISCOUNT_RATE = 0.1;

    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);
    }

    private static double calculateShipping(double price) {
        return price < MINIMUN_PRICE ? SHIPPING_PRICE : FREE_SHIPPING; // hard coded (magic number)
    }

    private static double calculateDiscount(double price) {
        return price * DISCOUNT_RATE; // 10% (magic number)
    }
}
