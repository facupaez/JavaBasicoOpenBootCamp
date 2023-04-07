package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // cuando creamos listas debemos especificar el tipo de dato que contendran
        List<String> lista = new ArrayList<>();

        //agregando elementos a la lista
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");

        //imprimiendo elementos de la lista
        System.out.println(lista);

        //recorriendo lista
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // son muy utiles para crear listas de objetos
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford", "negro", 50000));
        cars.add(new Car("Chevrolet", "blanco", 100000));
        cars.add(new Car("Peugeot", "gris", 200000));

        System.out.println(cars);

        // recorriendo lista de objetos car
        for (Car car : cars) {
            System.out.println(car);
        }
    }

}
