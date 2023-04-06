package com.company;

public class ElectricCar extends Car {

    // agregamos atributos
    boolean electricEngine;

    // creamos constructor con atributos
    public ElectricCar(boolean electricEngine){
        this.electricEngine = electricEngine;
    }

    // creamos metodo string agrandole el nuevo atributo
    @Override
    public String toString() {
        return "ElectricCar{" +
                "color='" + color + '\'' +
                ", fabricante='" + manufacturer + '\'' +
                ", marca='" + brand + '\'' +
                ", numPuertas=" + doorsNum +
                ", numRuedas=" + wheelsNum +
                ", peso=" + weight +
                ", largo=" + length +
                ", velocidad=" + velocity +
                ", motorElectrico='" + electricEngine + '\'' +
                '}';
    }
}
