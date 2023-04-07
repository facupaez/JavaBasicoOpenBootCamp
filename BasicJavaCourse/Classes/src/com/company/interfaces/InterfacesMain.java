package com.company.interfaces;

import com.company.Car;

public class InterfacesMain {

    public static void main(String[] args) {

        // uso de interfaces utilizando polimorfismo
        CarService carService1 = new CarSportServiceImpl();
        CarService carService2 = new CarClassicServiceImpl();

        // utilizamos el metodo que pertenece a una interface en ambas instancias
        Car car1 = carService1.addCar();
        Car car2 = carService2.addCar();
    }
}
