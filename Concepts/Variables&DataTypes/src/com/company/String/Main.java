package com.company.String;

/**
 * @author Facu Paez
 * Los tipos de dato String son cadenas de texto
 */
public class Main {

    public static void main(String[] args) {

        // declarando variable String
        String greeting = "Hola mundo!";
        System.out.println(greeting);

        //metodos mas comunes String

        // longitud de cadena
        int stringLen = greeting.length();
        System.out.println("La longitud de mi cadena es de: " + stringLen + " carácteres");

        //transformar cadena a minuscula
        String stringMayus = greeting.toUpperCase();
        System.out.println("Mi cadena ahora es: " + stringMayus);

        //transformar cadena a mayuscula
        String stringMinus = greeting.toLowerCase();
        System.out.println("Mi cadena ahora es: " + stringMinus);

        //verificar con que empieza mi cadena
        boolean startsResult = greeting.startsWith("Men");
        if(startsResult){
            System.out.println("Empieza por lo que estoy buscando");
        }else{
            System.out.println("No empieza por lo que estoy buscando");
        }

        //verificar con que termina mi cadena
        boolean endsResult = greeting.endsWith("o!");
        if(endsResult){
            System.out.println("Termina por lo que estoy buscando");
        }else{
            System.out.println("No termina por lo que estoy buscando");
        }

        //buscar caracteres por indice en un string (empieza a contar desde 0)
        char charAtResult = greeting.charAt(3);
        System.out.println("La posición de mi carácter es: " + charAtResult);

        //recorriendo una string
        for (int i = 0; i < greeting.length(); i++) {
            char charAt = greeting.charAt(i);
            System.out.println("La posición de mi carácter es: " + charAt);
        }

        //recorriendo String al reves
        for(int i=greeting.length()-1; i >= 0; i--) {
            char charAt = greeting.charAt(i);
            System.out.println("La posición de mi carácter es: " + charAt);
        }
    }
}
