package com.company;

public class TryCatchFinallyMain {

    public static void main(String[] args) {

        /*
        Tenemos 3 tipos de errores:
        1. Error de sintaxis: cuando escribimos mal el código.
        2. Run time error: Cuando el programa arroja un error en tiempo de ejecución.
        3. Error lógico: Cuando la lógica de programación es mala y funciona mal.
         */

        // 1. Error de sintaxis
        // String string = "hola"

        // 2. Run time error: estos errores arrojan excepciones
        // con bloques tr...catch podemos controlar estos errores
        // en try tendremos el codigo que puede ocasionar excepciones
        try {
            int result = 5 / 0;
            // en el bloque catch mostraremos un mensaje de la excepcion
        } catch (ArithmeticException e) {
            e.printStackTrace();
            //finally es opcional, si lo colocamos siempre se ejecuta si o si
        } finally {
            System.out.println("Cierre de recursos");
        }

        // al hacer el bloque try catch el programa continua ejecutandose, de lo contrario termina su ejecucion
        System.out.println("Prueba");


        // 3. Error lógico
        int temperature = 35;
        if (temperature > 30) System.out.println("Hace frío!");
    }
}
