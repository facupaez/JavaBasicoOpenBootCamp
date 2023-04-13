package com.company;

public class Main {

    public static void main(String[] args) {

        // creamos objetos smartphone y smartwatch usando encapsulacion, herencia y polimorfismo

        SmartPhone smartphone = new SmartPhone("Negro", "Android", 0.50, 2.0, 6.1, 4500, true, "5g", true, true, true);
        SmartWatch smartwatch = new SmartWatch("White", "MacOS", 0.1, 1.0, 3.2, 2000, false, true, true, true, true);

        System.out.println(smartphone);
        System.out.println(smartwatch);

        // modificando atributos de clases padre e hija
        smartphone.setOperativeSystem("iOS");
        smartphone.setFlashlight(false);
        smartwatch.setOperativeSystem("WearOS");
        smartwatch.setStepCounter(false);

        // obteniendo atributos de clases padre e hija
        System.out.println(smartphone.getOperativeSystem());
        System.out.println(smartphone.isFlashlight());
        System.out.println(smartwatch.getOperativeSystem());
        System.out.println(smartwatch.isStepCounter());


    }
}
