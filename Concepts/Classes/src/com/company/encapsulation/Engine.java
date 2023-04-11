package com.company.encapsulation;

public class Engine {

    // 1. Propiedades
    private int horsepower;
    private double weight;
    private double displacement;

    // 2. Constructores

    public Engine() {
    }

    public Engine(int horsepower, double weight, double displacement) {
        this.horsepower = horsepower;
        this.weight = weight;
        this.displacement = displacement;
    }

    // 3. Funciones

    // 4. Getters y Setters


    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    // 5. Metodo toString
    @Override
    public String toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                ", weight=" + weight +
                ", displacement=" + displacement +
                '}';
    }
}
