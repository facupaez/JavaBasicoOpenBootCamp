package com.company.encapsulation;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine(100, 1800.50, 2.5);
        Car car = new Car("Black", "Toyota", 4, 5, engine);

        // imprimimos propiedades protegidas a traves del metodo toString
        System.out.println(car);

        // imprimimos propiedades protegidas a traves del metodo get
        System.out.println(car.getColor());

        // modificamos propiedades protegidas a traves del metodo set
        car.setColor("Red");

        // imprimimos propiedades protegidas a traves del metodo get
        System.out.println(car.getColor());

        // imprimimos propiedades protegidas a traves del metodo toString
        System.out.println(engine);

        // imprimimos propiedades protegidas a traves del metodo get
        System.out.println(engine.getHorsepower());

        // modificamos propiedades protegidas a traves del metodo set
        engine.setHorsepower(200);

        // imprimimos propiedades protegidas a traves del metodo get
        System.out.println(engine.getHorsepower());
    }
}
