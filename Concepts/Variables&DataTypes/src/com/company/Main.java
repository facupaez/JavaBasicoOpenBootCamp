package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // tipoDeDato nombreVariable = valorVariable;
        // tipoDeDato nombreVariable;
        // nombreVariable = valorVariable;

        // numeros enteros
        byte number1 = 1; //1 byte
        short number2 = 2; //2 byte
        int number3 = 3; //4 byte
        long number4 = 4; //8 byte

        // numeros decimales/flotantes
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

        //tipos envoltorio
        Integer numero = null;

        // la clasae BigDecimal nos ayuda a tener alta precision en los resultados de decimales
        // podemos usar este tipo de dato cuando trabajemos con finanzas
        BigDecimal valorA = new BigDecimal(3.14f);
        BigDecimal valorB = new BigDecimal(3.15f);

        // debemos trabajar siempre sobre el tipo de dato BigDecimal
        BigDecimal result = valorA.add(valorB);
        System.out.println(result);
    }
}
