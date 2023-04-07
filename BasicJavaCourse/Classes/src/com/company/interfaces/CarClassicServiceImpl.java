package com.company.interfaces;

import com.company.Car;
import com.company.ElectricCar;
import com.company.interfaces.CarService;

public class CarClassicServiceImpl implements CarService {

    //implementando metodo
    @Override
    public Car addCar() {
        System.out.println("Creando coche clásico");
        return new ElectricCar();
    }
}
