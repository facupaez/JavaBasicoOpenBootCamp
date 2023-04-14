package com.company.interfaces;

import com.company.Car;
import com.company.HybridCar;

import java.util.List;

public class CarSportServiceImpl implements CarService {

    //implementando metodo usando clase Car y HybridCar

    @Override
    public void addCar(Car car) {
        System.out.println("Creando coche sport");
    }

    @Override
    public List<Car> findAll() {
        return null;
    }

    @Override
    public void deleteCar(Car car) {

    }
}
