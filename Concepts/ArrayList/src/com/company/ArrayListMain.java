package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMain {

    public static void main(String[] args) {

        // cuando declaramos ArrayList debemos especificar el tipo de dato que contendran
        // estos aumentan su capacidad como los vectores pero en un 50%
        ArrayList<String> list = new ArrayList<>();

        //agregando elementos a la lista
        list.add("uno");
        list.add("dos");
        list.add("tres");

        //imprimiendo elementos de la lista
        System.out.println(list);

        //recorriendo lista con foreach
        for (String elemento : list) {
            System.out.println(elemento);
        }

        // recorriendo lista con for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // son muy utiles para crear listas de objetos
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford", "negro", 50000));
        cars.add(new Car("Chevrolet", "blanco", 100000));
        cars.add(new Car("Peugeot", "gris", 200000));

        System.out.println(cars);

        // recorriendo lista de objetos car
        for (Car car : cars) {
            System.out.println(car);
        }

        //transformando ArrayList en array
        String[] array = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
        System.out.println(Arrays.toString(array));
    }

}
