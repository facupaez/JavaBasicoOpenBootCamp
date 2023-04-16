package com.company;

import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {

        // declarando LinkedList como cualquier lista
        // esta lista es mas rapida cuando modificamos datos
        // estas listas pueden implementar colas FIFO(atencion a cliente) y LIFO(stock produccion)
        LinkedList<String> list = new LinkedList<>();

        // agregando elementos a la lista
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        System.out.println(list);
    }
}
