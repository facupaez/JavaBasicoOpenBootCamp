package com.company;

import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {

        try {
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }
    }

    /*
    Metodo que lee nombres de consola y verifica que tengan longitud igual o mayor de 5 caracteres
     */
    private static void leerNombres() throws NameFormatException {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while (keyboard.hasNext()) {
            System.out.println("Introduce un nombre");
            String nombre = keyboard.nextLine();
            if (nombre.length() < 5) {
                keyboard.close();
                throw new NameFormatException("El nombre debe contener un mínimo de 8 carácteres.");
            }
        }
        keyboard.close();
    }
}
