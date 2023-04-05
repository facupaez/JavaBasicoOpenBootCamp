package com.company;

public class Car {
    // usamos clases para representar objetos de la vida real

    // atributos/propiedades = caracteristicas del objeto
    String color;
    String fabricante;
    String marca;
    int numPuertas;
    int numRuedas;
    double peso;
    double largo;
    int velocidad = 0;

    // constructores = nos permite representar objetos de esta clase
    // por defecto se crea un constructor vacio sin valores en los atributos
    public Car() { // por defecto
    }

    public Car(String color, String fabricante) { // constructor personalizado con argumentos
        this.color = color;
        this.fabricante = fabricante;
    }

    // comportamientos del objeto = funciones/metodos

    public void acelerar(int cantidad) {
        if (cantidad > 0 && cantidad <= 180) {
            this.velocidad += cantidad;
        } else {
            System.out.println("La velocidad debe ser entre 0 y 180");
        }
    }

    // el metodo toString devuelve un texto con el valor de todos los atributos
    // de lo contarrio cuando querramos imprimir el objeto veremos la clase y la direccion de memoria
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", marca='" + marca + '\'' +
                ", numPuertas=" + numPuertas +
                ", numRuedas=" + numRuedas +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
