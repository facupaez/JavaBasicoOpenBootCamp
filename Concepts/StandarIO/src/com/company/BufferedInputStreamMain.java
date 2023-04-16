package com.company;


import java.io.*;

public class BufferedInputStreamMain {

    public static void main(String[] args) {

        // Utilizaremos el objeto BufferedInputStream para leer ficheros como entrada
        // La diferencia es que utiliza parcialmente su propia memoria para leer el fichero, lo que
        // nos ayuda a saturar menos la memoria de nuestro sistema.
        try {
            InputStream fichero = new FileInputStream("D:\\Programacion\\Ejercicios OpenBootcamp\\Java basico\\Concepts\\StandarIO\\test.txt");
            BufferedInputStream ficheroBuffered = new BufferedInputStream(fichero);

            try {
                int dato = ficheroBuffered.read();

                while (dato != -1) {
                    System.out.print((char)dato);
                    dato = ficheroBuffered.read();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

