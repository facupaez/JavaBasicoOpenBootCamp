package com.company.interfaces;

import com.company.Car;
import com.company.ElectricCar;

import java.util.List;

public class CarClassicServiceImpl implements CarService {

    //implementando metodo usando clase Car y ElectricCar

    @Override
    public void addCar(Car car) {
        System.out.println("Creando coche clásico");
    }

    @Override
    public List<Car> findAll() {
        return null;
    }

    @Override
    public void deleteCar(Car car) {

    }
}
