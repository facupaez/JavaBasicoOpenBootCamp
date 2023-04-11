package com.company;

/*
podemos declarar una clase padre com abstracta para poder definir una serie atributos, constructores
y metodos pero que solo se puedan instanciar por medio de las clases hijas
 */
public abstract class Car {
    // usamos clases para representar objetos de la vida real

    // 1. atributos/propiedades =  caracteristicas del objeto
    String color;
    String manufacturer;
    String brand;
    int doorsNum;
    int wheelsNum;
    double weight;
    double length;
    int velocity = 0;

    // 2. constructores = nos permite representar objetos de esta clase
    // por defecto se crea un constructor vacio sin valores en los atributos
    public Car() { // por defecto
    }

    // sobre carga de constructor
    // constructor personalizado con todos sus atributos recibidos como argumentos
    public Car(String color, String manufacturer, String brand, int doorsNum, int wheelsNum, double weight, double length) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.doorsNum = doorsNum;
        this.wheelsNum = wheelsNum;
        this.weight = weight;
        this.length = length;
    }

    // sobre carga de constructor
    // constructor personalizado con 2 atributos recibidos como argumentos
    public Car(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }

    // 3. comportamientos del objeto = funciones/metodos

    public void speedUp(int amount) {
        if (amount > 0 && amount <= 180) {
            this.velocity += amount;
        } else {
            System.out.println("La velocidad debe ser entre 0 y 180");
        }
    }

    // el metodo toString devuelve un texto con el valor de todos los atributos
    // de lo contarrio cuando querramos imprimir el objeto veremos la clase y la direccion de memoria
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fabricante='" + manufacturer + '\'' +
                ", marca='" + brand + '\'' +
                ", numPuertas=" + doorsNum +
                ", numRuedas=" + wheelsNum +
                ", peso=" + weight +
                ", largo=" + length +
                ", velocidad=" + velocity +
                '}';
    }
}
