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

        //funcion con retorno int
        System.out.println(sum(1, 2));
    }

    /*
    las funciones tienen distintos scopes:
    public: se puede acceder desde cualquier paquete
    private: no se puede acceder desde cualquier paquete
    protected: se puede acceder desde el mismo paquete o solo clases hijas (herencia)
     */
    public static void holaMundo(String name) {
        System.out.println("Hola " + name + " desde un método!");
    }

    public static void holaMundo() {
        System.out.println("Hola mundo desde un método!");
    }

    /*
    las funciones pueden devolver un vacio (void) o devolver algun tipo de dato con return
     */

    private static int sum(int num1, int num2){
        return num1 + num2;
    }
}
