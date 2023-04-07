package com.company.interfaces;

import com.company.Car;
import com.company.HybridCar;
import com.company.interfaces.CarService;

public class CarSportServiceImpl implements CarService {

    //implementando metodo
    @Override
    public Car addCar() {
        System.out.println("Creando coche sport");
        return new HybridCar();
    }
}
