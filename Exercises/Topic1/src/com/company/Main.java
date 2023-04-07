package com.company;

/**
 * @author Facu Paez
 * Crea un proyecto de Java desde 0
 * Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 * Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // números enteros
        byte number1 = 1; //1 byte
        short number2 = 2; //2 byte
        int number3 = 3; //4 byte
        long number4 = 4; //8 byte

        // números decimales/flotantes
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        // character
        char caracter1 = 'a'; //almacenan solo 1 caracter

        // booleanos
        boolean verdadero = true;
        boolean falso = false;

        //cadenas de texto
        String nombre = "Charly";
        String apellido = "Newman";

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        System.out.println(decimal1);
        System.out.println(decimal2);

        System.out.println(caracter1);

        System.out.println(verdadero);
        System.out.println(falso);

        System.out.println(nombre);
        System.out.println(apellido);
    }
}
