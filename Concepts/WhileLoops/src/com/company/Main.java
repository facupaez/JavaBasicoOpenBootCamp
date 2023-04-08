package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        // si la condicion es veradera entra en el loop, cuando es falsa nunca entra al loop
        // mientras la condicion es verdadera se ejecuta el loop, cuando es falsa se detiene el loop
        while (count < 10) {
            System.out.println("Hola, valgo " + count);
            count++;
        }

        System.out.println("\nUso de while:\n");
        //probando while con un array
        int[] numbers = {1, 2, 3, 4, 5};
        int contador = 0;
        while (contador < numbers.length) {
            System.out.println(numbers[contador]);
            contador++;
        }

        System.out.println("\nUso break:\n");
        // para romper un bucle podemos utilizar la palabra reservada break;
        contador = 0;
        while (contador < numbers.length) {
            if (numbers[contador] == 3) {
                break;
            }
            System.out.println(numbers[contador]);
            contador++;
        }

        System.out.println("\nUso continue:\n");
        // para saltar una iteracion en un bucle podemos utilizar la palabra reservada continue;
        contador = -1;
        while (contador < numbers.length - 1) {
            contador++;
            if (numbers[contador] == 3) {
                continue;
            }
            System.out.println(numbers[contador]);
        }
    }
}
