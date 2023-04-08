package com.company;

public class Main {

    public static void main(String[] args) {

        // declarando array
        //                      0             1             2          3
        String[] cities = {"New York", "San Francisco", "Chicago", "Hudson"}; //length 4

        // iterando array con foreach
        for (String city : cities) {
            System.out.println(city);
        }

        // cuando usamos un foreach se hace una copia de los valores del array por lo que este no cambia

        int sum = 0;

        //declarando array
        Integer[] numbers = {1, 2, 3, 4, 5, 6};

        // sumando array de numeros enteros con foreach
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("La suma del array es: " + sum);

    }
}
