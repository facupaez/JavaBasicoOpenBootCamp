package com.company;

import java.util.Vector;

/**
 * @author Facu Paez
 * 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
 *    Elimina el 2o y 3er elemento y muestra el resultado final.
 * 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
 *    1000 elementos para ser añadidos al mismo.
 * @version 1.0
 */
public class VectorsMain {

    public static void main(String[] args) {


        // 3.
        Vector<String> cities = new Vector<>();

        cities.add("Córdoba");
        cities.add("Rosario");
        cities.add("Buenos Aires");
        cities.add("Mendoza");
        cities.add("Tucumán");

        // eliminando segundo elemento por index
        cities.remove(1);
        // eliminando tercer elemento por valor
        cities.remove("Buenos Aires");

        System.out.println(cities);

        // 4.
        /*
            El problema al usar un vector con la capacidad por default que es 10, es que cada vez que llegue
            a ese limite se crea una copia del vector, y cuando llegue a 20, y a 30, etc.
            Esto afecta en la rapidez del programa ya que utiliza demasiada memoria.
         */
    }
}
