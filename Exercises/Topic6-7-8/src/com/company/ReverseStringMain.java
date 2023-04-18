package com.company;

/**
 * @author Facu Paez
 * Dada la función:
 * public static String reverse(String texto) { }
 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo!",
 * debe retornar "!odnum aloh".
 * @version 1.0
 */
public class ReverseStringMain {

    public static void main(String[] args) {

        System.out.println(reverseString("Hola mundo!"));
    }

    private static String reverseString(String string) {
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            rs.insert(0, c);
        }

        return rs.toString();
    }
}
