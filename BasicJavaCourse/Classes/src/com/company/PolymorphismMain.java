package com.company;

public class PolymorphismMain {

    public static void main(String[] args) {
        /*
         cuando tenemos una clase padre que hereda metodos y atributos a otras clases podremos aplicar el
        concepto de polimorfismo (multiples formas)
        */

        // instancias normales
        // Car car1 = new Car();
        ElectricCar car2 = new ElectricCar();
        HybridCar car3 = new HybridCar();

        // con polimorfismo podemos usar la clase padre para instanciar las clases hijas

        Car car4 = new ElectricCar();
        Car car5 = new HybridCar();

        // instanceof nos permite ver si un objeto es instancia de una clase mediante un booleano
        System.out.println(car4 instanceof ElectricCar); //true
        System.out.println(car5 instanceof ElectricCar); //false
        System.out.println(car5 instanceof HybridCar); //true
        System.out.println(car4 instanceof HybridCar); //false
    }

}
