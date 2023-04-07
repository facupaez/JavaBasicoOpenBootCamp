package com.company;

public class Car {
    private String brand;
    private String color;
    private int km;

    public Car(){}

    public Car(String brand, String color, int km) {
        this.brand = brand;
        this.color = color;
        this.km = km;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", km=" + km +
                '}';
    }
}
