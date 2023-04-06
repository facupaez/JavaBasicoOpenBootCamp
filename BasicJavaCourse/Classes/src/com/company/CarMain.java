package com.company;

public class CarMain {

    public static void main(String[] args) {

        // creamos el objeto de la clase Car (instancia de una clase)
        // en los parentesis invocaremos los metodos constructores que querramos
        Car car = new Car();

        Car car1 = new Car("red", "Toyota", "Hilux", 4, 4, 1520, 2.20);

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


    }
}
