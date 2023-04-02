package com.company;

public class Main {

    public static void main(String[] args) {
        //invocamos funcion "void" con parentesis al final
        //las funciones sirven para ahorrar lineas de codigo pudiendo llamarlas las veces que querramos
        holaMundo();
        holaMundo();
        holaMundo();

        //invocamos funcion que devuelve un String
        holaMundo("Charly");
        holaMundo("John");
    }

    private static void holaMundo(String name) {
        System.out.println("Hola " + name + " desde un método!");
    }

    private static void holaMundo() {
        System.out.println("Hola mundo desde un método!");
    }
}
