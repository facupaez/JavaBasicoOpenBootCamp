package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        // listas de tipo maps (clave, valor)
        Map<String, String> personas = new HashMap<>();

        //especificamos clave
        personas.put("nombre", "Juan");
        personas.put("apellido", "Perez");

        //imprimimos el map
        System.out.println(personas);

        //iterando sobre las claves del mapa
        for(String key : personas.keySet()){
            System.out.println(key);
        }

        //iterando sobre los valores del mapa
        for(String values : personas.values()){
            System.out.println(values);
        }

        //iterando claves y valores con Entry
        for (Map.Entry<String, String> entry : personas.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());;
        }
    }
}
