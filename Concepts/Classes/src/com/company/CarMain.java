package com.company;

public class CarMain {

    public static void main(String[] args) {

        // creamos el objeto de la clase Car (instancia de una clase)
        // en los parentesis invocaremos los metodos constructores que querramos
        // Car car = new Car();

        // clase abstarcta
        Car car1 = new ElectricCar("red", "Toyota", "Hilux", 4, 4, 1520, 2.20, true);

        // usamos el metodo del objeto
        car1.speedUp(50);
        System.out.println(car1);

        // cambiar atributo del objeto
        car1.color = "negro";
        System.out.println(car1);

        // creamos el objeto ElectricCar
        ElectricCar electricCar = new ElectricCar(true);

        // la clase ElectricCar hereda todas las propiedades y metodos de la clase Car
        electricCar.color = "gris";
        electricCar.manufacturer = "Mercedes";
        electricCar.velocity = 100;
        System.out.println(electricCar);

        // creamos el objeto HybridCar
        HybridCar hybridCar = new HybridCar(true);

        // la clase HybridCar hereda todas las propiedades y metodos de la clase Car
        hybridCar.color = "beige";
        hybridCar.manufacturer = "BMW";
        hybridCar.velocity = 80;
        System.out.println(hybridCar);

        // creamos objeto con contructor sobrecargado
        ElectricCar electricCar1 = new ElectricCar("verde", "VW", "Polo", 4, 4, 1520, 2, true);

        // utilizamos el metodo speedUp que sobre escribimos en la clase ElectricCar
        electricCar1.speedUp(50);
        System.out.println(electricCar1);
    }
}
