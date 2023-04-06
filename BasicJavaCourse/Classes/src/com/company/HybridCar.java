package com.company;

public class HybridCar extends Car{

    boolean hybridEngine;

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
