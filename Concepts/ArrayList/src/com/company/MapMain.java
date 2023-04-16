package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        // listas de tipo maps (clave, valor) tipo diccionario
        // en estas listas no podemos tener la clave duplicada
        HashMap<String, String> personas = new HashMap<>();

        // agregando datos a la lista
        // primer parametro clave, segundo parametro valor
        personas.put("nombre", "Juan");
        personas.put("apellido", "Perez");
        personas.put("edad", "18");
        personas.put("altura", "1.72");

        // imprimimos el map
        System.out.println(personas);

        // modificando valor a traves de la clavo
        personas.replace("nombre", "Alvaro");
        System.out.println(personas);

        // iterando sobre las claves del mapa
        for (String key : personas.keySet()) {
            System.out.println("Clave: " + key);
        }

        // iterando sobre los valores del mapa
        for (String values : personas.values()) {
            System.out.println("Valor: " + values);
        }

        // iterando claves y valores con Entry
        for (Map.Entry entry : personas.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " / " + "Valor: " + entry.getValue());
        }
    }
}
