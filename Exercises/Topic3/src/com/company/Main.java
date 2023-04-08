package com.company;

/**
 * @author Facu Paez
 * Crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        String[] pokemons = {"Pikachu", "Charizard", "Bulbasaur", "Wartortle", "Squirtle"};
        String concat = "";
        for (String pokemon : pokemons) {
           concat = concat + " | " + pokemon;
        }
        System.out.println("Concatenando array pokemons: " + concat);
    }
}
