package com.company;

public class CarMain {

    public static void main(String[] args) {

        // creamos el objeto de la clase Car (instancia de una clase)
        // en los parentesis invocaremos los metodos constructores que querramos
        Car car = new Car();

        Car car1 = new Car("red", "Toyota", "Hilux", 4, 4, 1520, 2.20);

        // usamos el metodo del objeto
        car1.acelerar(50);
        System.out.println(car1);

        // cambiar atributo del objeto
        car1.color = "negro";
        System.out.println(car1);
    }
}
