package com.company;

// heredamos de la clase Car con la palabra reservada extends
public class ElectricCar extends Car {

    // agregamos atributos
    boolean electricEngine;

    // creamos constructor vacio
    public ElectricCar() {
    }

    // creamos constructor con atributos
    public ElectricCar(boolean electricEngine) {
        this.electricEngine = electricEngine;
    }

    // sobre cargamos constructor padre
    public ElectricCar(String color, String manufacturer, String brand, int doorsNum, int wheelsNum, double weight, double length, boolean electricEngine) {
        // utilizamos la palabra super para acceder al constructor de la clase superior
        super(color, manufacturer, brand, doorsNum, wheelsNum, weight, length);
        this.electricEngine = electricEngine;
    }

    //sobre escribimos metodo de la clase padre Car
    @Override
    public void speedUp(int amount) {
        int modifyAmount = amount * 2;
        // utilizamos la palabra super para acceder al metodo de la clase superior
        super.speedUp(modifyAmount);
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
