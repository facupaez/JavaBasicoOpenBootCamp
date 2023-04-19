package com.company;

import java.io.*;

/**
 * @author Facu Paez
 * 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
 * dado en "fileOut".
 * @version 1.0
 */
public class IOMain {

    public static void main(String[] args) {

        try {
            InputStream from = new FileInputStream("D:\\Programacion\\Ejercicios OpenBootcamp\\Java basico\\Exercises\\Topic6-7-8\\from.txt");
            PrintStream to = new PrintStream("D:\\Programacion\\Ejercicios OpenBootcamp\\Java basico\\Exercises\\Topic6-7-8\\to.txt");

            try {
                copyFile(from, to);
                System.out.println("File copied successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void copyFile(InputStream fileIn, PrintStream fileOut) throws IOException {

        try {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileIn.read(buffer)) != -1) {
                fileOut.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
