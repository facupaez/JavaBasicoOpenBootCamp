package com.company.interfaces;

public class CarCRUDImpl implements CarCRUD{


    @Override
    public void saveCar() {
        System.out.println("Car saved!");
    }

    @Override
    public void deleteCar() {
        System.out.println("Car deleted!");
    }

    @Override
    public void findAll() {
        System.out.println("Cars found!");
    }
}
