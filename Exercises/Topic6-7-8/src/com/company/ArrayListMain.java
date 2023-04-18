package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Facu Paez
 * 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
 * Recorre ambos mostrando únicamente el valor de cada elemento.
 * 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 * A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo
 * y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y
 * cuando cumplas el primer "for" de relleno.
 * @version 1.0
 */
public class ArrayListMain {

    public static void main(String[] args) {

        // 5.
        ArrayList<String> names = new ArrayList<>();
        names.add("Pedro");
        names.add("Benicio");
        names.add("Fausto");
        names.add("Maximiliano");

        // recorriendo ArrayList
        for (String name : names){
            System.out.println(name);
        }

        // convirtiendo ArrayList
        LinkedList<String> namesCopy = new LinkedList<>(names);

        // recorriendo LinkedList
        for (String nameCopy : namesCopy){
            System.out.println(nameCopy);
        }
    }

}
