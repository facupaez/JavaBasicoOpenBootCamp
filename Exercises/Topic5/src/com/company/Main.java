package com.company;

import com.company.interfaces.CarCRUD;
import com.company.interfaces.CarCRUDImpl;

/**
 * @author Facu Paez
 * Crear una interfaz CocheCRUD.
 *
 * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
 *
 * Como métodos de CocheCRUD podemos poner:
 *
 * save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
 *
 * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // implementando CarCRUD
        CarCRUD carCRUD = new CarCRUDImpl();

        carCRUD.saveCar();
        carCRUD.deleteCar();
        carCRUD.findAll();
    }
}
