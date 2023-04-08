package com.company;

public class Main {

    public static void main(String[] args) {

        // los bucles for nos permite repetir codigo la cantidad de veces que le indiquemos
        // estan compuestos por la declaracion de variable, condicion e incremento/decremento
        for (int i = 1; i <= 10; i++) {
            System.out.println("Esta es mi " + i + " iteración.");
        }

        // iterando array
        //                      0             1             2          3
        String[] cities = {"New York", "San Francisco", "Chicago", "Hudson"}; //length 4
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        // sumando array de numeros enteros
        int sum = 0;
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("La suma del array es: " + sum);
    }
}
