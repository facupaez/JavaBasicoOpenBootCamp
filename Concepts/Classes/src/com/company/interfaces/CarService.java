package com.company.interfaces;

import com.company.Car;

import java.util.List;

// las interfaces definen metodos abstractos para utilizar en la clase que implementen esta interface
public interface CarService {

    /*
     los metodos de esta clase deben ser abstractos y no se implementarse
     Se implementan en su clase corespondiente
     */

    public void addCar(Car car);

    public List<Car> findAll();

    public void deleteCar(Car car);
}
