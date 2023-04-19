package com.company.myprogram;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Facu Paez
 * 9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
 * un HashMap y un ArrayList, LinkedList o array.
 * Crearemos una lista de nombres que se va almacenar en un archivo y despues leeremos este archivo.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Pedro");
        names.add("Benicio");
        names.add("Fausto");
        names.add("Maximiliano");

        HashMap<Integer, String> programmingLanguages
                = new HashMap<>();
        programmingLanguages.put(1, "Java");
        programmingLanguages.put(2, "Python");
        programmingLanguages.put(3, "PHP");
        programmingLanguages.put(4, "SQL");
        programmingLanguages.put(5, "C ++");

        copyList(names, programmingLanguages);
        readList();
    }

    private static void readList() {
        try {
            InputStream file = new FileInputStream("D:\\Programacion\\Ejercicios OpenBootcamp\\Java basico\\Exercises\\Topic6-7-8\\src\\com\\company\\myprogram\\to.txt");
            try {
                System.out.println("Reading file...");
                int dato = file.read();
                while (dato != -1) {
                    System.out.print((char) dato);
                    dato = file.read();
                }
                System.out.println("Successful reading!");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static void copyList(ArrayList<String> names, HashMap<Integer, String> programmingLanguages) {
        try {
            PrintStream to = new PrintStream("D:\\Programacion\\Ejercicios OpenBootcamp\\Java basico\\Exercises\\Topic6-7-8\\src\\com\\company\\myprogram\\to.txt");
            to.println(names);
            to.println(programmingLanguages);
            System.out.println("Lists copied successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
