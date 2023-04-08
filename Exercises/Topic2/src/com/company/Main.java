package com.company;

/**
 * @author Facu Paez
 * Crear función que reciba un precio y devolver el precio con IVA incluído
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        
        int value = 120;
        double price = calucarIVA(value);
        System.out.println("El IVA incluído de: " + value + " es " + price);
    }

    private static double calucarIVA(double price) {
        return price * 0.21 + price;
    }
}
