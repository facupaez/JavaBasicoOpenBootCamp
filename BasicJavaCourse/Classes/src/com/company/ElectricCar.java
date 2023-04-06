package com.company;

public class ElectricCar extends Car {

    // agregamos atributos
    boolean electricEngine;

    // creamos constructor con atributos
    public ElectricCar(boolean electricEngine){
        this.electricEngine = electricEngine;
    }

    // sobre cargamos constructor padre
    public ElectricCar(String color, String manufacturer, String brand, int doorsNum, int wheelsNum, double weight, double length, boolean electricEngine) {
        super(color, manufacturer, brand, doorsNum, wheelsNum, weight, length);
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
