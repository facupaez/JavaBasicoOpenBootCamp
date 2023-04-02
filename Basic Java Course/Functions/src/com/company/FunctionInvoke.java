package com.company;

public class FunctionInvoke {
    public static void main(String[] args) {
        /*
        Al ser una funcion static debemos indicar el nombre de la clase a la que pertenece.

        Podemos invocar funciones desde otras clases siempre que su scope lo permita,
        debiendo ser funciones publicas
         */
        Main.holaMundo();
    }
}
