package com.company;

public class Main {

    public static void main(String[] args) {

        //la palabra reservada continue hace que se salte de iteracion cuando estamos en un loop
        //la palabra reservada break hace que el bucle se detenga, rompiendo el flujo del bucle

        String weather = "";

        // la sentencia switch evalua la variable que le pasamos y ejecuta el bloque que matchea con esta
        // si no cumple ningun case, devuelve lo que haya en default
        switch (weather) {
            case "sunny":
                System.out.println("El clima es soleado");
                break;
            case "cloudy":
                System.out.println("El clima es nublado");
                break;
            case "windy":
                System.out.println("El clima es ventoso");
                break;
            default:
                System.out.println("El clima no existe");
        }
    }
}
