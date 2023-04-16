package com.company;


import java.io.*;

public class InputStreamMain {

    public static void main(String[] args) {

        // Utilizaremos el objeto InputStream para leer ficheros como entrada
        try {
            InputStream fichero = new FileInputStream("D:\\Programacion\\Ejercicios OpenBootcamp\\Java basico\\Concepts\\StandarIO\\test.txt");

            try {
                // leeremos caracter por caracter
                int dato = fichero.read();
                // mientras el caracter tenga un valor los ira leyendo, cuando no haya mas el while terminara
                while (dato != -1) {
                    System.out.print((char)dato);
                    dato = fichero.read();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

