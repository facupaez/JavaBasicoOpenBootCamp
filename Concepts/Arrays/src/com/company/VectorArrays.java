package com.company;

import java.util.Vector;

public class VectorArrays {

    public static void main(String[] args) {

        // los vectores son como arrays pero pueden aumentar y decrecer su tamaño
        // estos vector no se utilizan ya que consumen mucha memoria cuando son muy grandes y hacen la copia
        // al agrandarse a si mismos

        // declarando vector de tipo int
        // podemos definir la capacidad pasandole un int como parametro
        Vector<Integer> vector = new Vector(50);

        // agregando elementos al vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Datos del vector: " + vector);

        // eliminar elementos del vector
        vector.remove(1);
        System.out.println("Datos del nuevo vector: " + vector);

        // viendo tamaño y capacidad de un vector

        // el tamaño es la cantidad de elemetnos que posee el vector
        System.out.println("Tamaño del vector: " + vector.size());

        // la capacidad por default es 10, pero a medida que la sobrepasamos aumenta en 10 haciedno una copia
        // del array que tiene guardado, esto hace que un vector sea dinamico
        System.out.println("Capacidad del vector: " + vector.capacity());

        // recorriendo vector con for
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Valor actual del vector: " + vector.get(i) + ", en la posicion " + i);
        }

        // recorriendo vector con foreach
        for( int i : vector){
            System.out.println("Valor actual del vector: " + i);
        }

    }
}
