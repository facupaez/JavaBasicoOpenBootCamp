package com.company;

public class TryCatchFinallyMain {

    public static void main(String[] args) {

        //control de excepciones

        // en el bloque try tendremos el codigo que puede ocasionar excepciones
        try {
            int result = 5 / 0;
            // en el bloque catch mostraremos un mensaje de la excepcion
        }catch (ArithmeticException e) {
            e.printStackTrace();
            //finally siempre se ejecuta si o si
        }finally {
            System.out.println("Cierre de recursos");
        }

        // al hacer el bloque try catch el programa continua ejecutandose, de lo contrario termina su ejecucion
        System.out.println("Prueba");
    }
}
