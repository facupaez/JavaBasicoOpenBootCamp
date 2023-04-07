package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // cuando queremos mostrar salidas utilizamos out
        System.out.println("Esto es una salida");

        // cuando queremos introducir datos utilizamos in
        // la clase Scanner nos ayuda a codificar los datos que introducimos
        Scanner scanner = new Scanner(System.in);

        // el metodo nextLine nos permite leer un texto
        System.out.println("Introduce un nombre:");
        String nombre = scanner.nextLine();
        System.out.println("El nombre introducido es: " + nombre);

        // el metodo nextInt nos permite leer numeros
        System.out.println("Introduce un número entero:");
        int num = scanner.nextInt();
        System.out.println("El número introducido es: " + num);
    }
}
