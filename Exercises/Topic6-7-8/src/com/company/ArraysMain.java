package com.company;

/**
 * @author Facu Paez
 * 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 * 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de
 * cada elemento en ambas dimensiones.
 * @version 1.0
 */
public class ArraysMain {

    public static void main(String[] args) {

        // 1.
        String[] animals = {"Dog", "Cat", "Pig", "Elephant", "Cow", "Turtle", "Fish"};

        for (String animal : animals) {
            System.out.println(animal);
        }

        //2.
        int[][] intNums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {11, 12, 13}};

        for (int i = 0; i < intNums.length; i++) {
            System.out.println("En el array " + i + ":");
            for (int j = 0; j < intNums[i].length; j++) {
                System.out.println(" en la posición: " + j + " está se encuentra el valor: " + intNums[i][j]);
            }
        }
    }
}
