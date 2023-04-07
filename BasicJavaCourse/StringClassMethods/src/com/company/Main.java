package com.company;

public class Main {

    public static void main(String[] args) {
        // metodos clase String

        /*
        length();
        startsWith("");
        endsWith("");
        indexOf("");
        subString(1, 5);
        trim();
        equals("");
        toUpperCase();
        toLowerCase();
         */

        String str = "    Hola mundo!   ";

        // cantidad de caracteres
        System.out.println(str.length());

        // mayusculas
        System.out.println(str.toUpperCase());

        // minusculas
        System.out.println(str.toLowerCase());

        // eliminar espacios sobrantes
        System.out.println(str.trim());

        // comparando Strings
        System.out.println(str.equals("hola"));

        // comienza con
        System.out.println(str.startsWith("   "));

        // termina con
        System.out.println(str.endsWith("Hola"));

        // extraer subcadena de texto de otra cadena de texto
        System.out.println(str.substring(1, 5));

        // extraer el numero de indice de la palabra o letra que querramos
        System.out.println(str.indexOf("Hola"));
    }
}
