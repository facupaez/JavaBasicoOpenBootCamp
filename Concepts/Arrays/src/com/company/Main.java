package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // creando array de tipo int

        // definimos un array de notas con valores enteros, y que va a contener 10 posiciones fijas
        int[] arrNotas = new int[10];

        // definimos un array de notas con valores enteros pero le definimos sus valores fijos
        int[] arrNotas1 = {8, 2, 7, 5, 3, 6};

        // definimos un array para comparar
        int[] arrNotas2 = {2, 5, 7, 8, 1, 5};

        // modificando posicion en array
        arrNotas[0] = 10;
        arrNotas[1] = 6;

        // accendiento a valor de array
        System.out.println(arrNotas[0]);
        System.out.println(arrNotas[1]);

        // recorriendo array con for
        System.out.println("Bucle for");
        for (int i = 0; i < arrNotas1.length; i++) {
            System.out.println(arrNotas1[i]);
        }

        // recorriendo array con foreach
        System.out.println("Bucle foreach");
        for (int nota : arrNotas1) {
            System.out.println(nota);
        }

        // recorriendo array con while
        System.out.println("Bucle while");
        int i = 0;
        while (i < arrNotas1.length) {
            System.out.println(arrNotas1[i]);
            i++;
        }

        // metodos super utilizados en arrays
        System.out.println("\n3 metodos super utilizados en arrays\n");

        // ver longitud de un array
        System.out.println("Este array tiene " + arrNotas1.length + " posiciones");

        // sort nos permite ordenar un array
        Arrays.sort(arrNotas1);
        for (int nota : arrNotas1) {
            System.out.println(nota);
        }

        // binarySearch devuelve la posicion del elemento que le pasemos
        /*
        el array siempre debe estar ordenado de lo contarrio, el resultado sera indefinido
        si hay duplicados, no hay garantina que devuelva el resultado que buscamos
        si no encuentra el elemento, devuelve -1
         */
        System.out.println(Arrays.binarySearch(arrNotas1, 3));

        // equals nos permite comparar entre dos arrays
        System.out.println(Arrays.equals(arrNotas2, arrNotas1));
    }
}
