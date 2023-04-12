package com.company;

// heredamos de la clase Car con la palabra reservada extends

public class HybridCar extends Car{

    boolean hybridEngine;

    // creamos constructor vacio
    public HybridCar() {
    }

    // creamos constructor con atributos
    public HybridCar(boolean hybridEngine) {
        this.hybridEngine = hybridEngine;
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "color='" + color + '\'' +
                ", fabricante='" + manufacturer + '\'' +
                ", marca='" + brand + '\'' +
                ", numPuertas=" + doorsNum +
                ", numRuedas=" + wheelsNum +
                ", peso=" + weight +
                ", largo=" + length +
                ", velocidad=" + velocity +
                ", motorHibrido=" + hybridEngine +
                '}';
    }
}
