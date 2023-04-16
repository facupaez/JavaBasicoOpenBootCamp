package com.company;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamMain {

    public static void main(String[] args) {

        // La clase PrintStream nos ayuda a generar salidas, como por ejemplo para escribir un fichero
        try {
            PrintStream info = new PrintStream("D:\\Programacion\\Ejercicios OpenBootcamp\\Java basico\\Concepts\\StandarIO\\info.txt");

            info.println("Hola Mundo desde PrintSream!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }
}
