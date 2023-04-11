package com.company.encapsulation;

public class Car {

    // aplicamos encapsulacion para proteger la manera en que se cambian las propiedades de una clase
    // encapsulando propiedades para no acceder directamente a estas desde cualquier clase

    private String color;
    private String brand;
    private int doorsNum;
    private int wheelsNum;
    private int velocity = 0;
    // podemos crear variables tipo objeto que se asocien a la clase padre por ej:
    private Engine engine;

    public Car() {
    }

    public Car(String color, String brand, int doorsNum, int wheelsNum, Engine engine) {
        this.color = color;
        this.brand = brand;
        this.doorsNum = doorsNum;
        this.wheelsNum = wheelsNum;
        this.engine = engine;
    }

    public void speedUp(int amount) {
        if (amount > 0 && amount <= 180) {
            this.velocity += amount;
        } else {
            System.out.println("La velocidad debe ser entre 0 y 180");
        }
    }

    // creamos getters y setter para acceder a las propiedades protegidas


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDoorsNum() {
        return doorsNum;
    }

    public void setDoorsNum(int doorsNum) {
        this.doorsNum = doorsNum;
    }

    public int getWheelsNum() {
        return wheelsNum;
    }

    public void setWheelsNum(int wheelsNum) {
        this.wheelsNum = wheelsNum;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // creamos metodo toString para acceder a las propiedades protegidas

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", marca='" + brand + '\'' +
                ", numPuertas=" + doorsNum +
                ", numRuedas=" + wheelsNum +
                ", velocidad=" + velocity +
                '}';
    }
}
