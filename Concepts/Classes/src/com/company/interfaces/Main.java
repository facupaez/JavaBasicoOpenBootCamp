package com.company.interfaces;

import com.company.Car;
import com.company.ElectricCar;
import com.company.HybridCar;

/**
 * @author Facu Paez
 * En este ejemplo veremos como persistir una base de datos usando interfaces
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // uso de interfaces utilizando polimorfismo
        CarService carService1 = new CarSportServiceImpl();
        CarService carService2 = new CarClassicServiceImpl();

        // utilizamos el metodo que pertenece a una interface en ambas instancias
        carService1.addCar(new ElectricCar());
        carService2.addCar(new HybridCar());
        carService1.findAll();
        carService2.findAll();
        carService1.deleteCar(new HybridCar());
        carService2.deleteCar(new HybridCar());
    }
}
