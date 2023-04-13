package com.company;

public abstract class SmartDevice {

    // 1. Variables de instancia
    protected String color;
    protected String operativeSystem;
    protected double weight;
    protected double memorySize;
    protected double screenSize;
    protected int batteryCapacity;
    protected boolean camera;

    // 2. Constructores
    public SmartDevice(){}

    public SmartDevice(String color, String operativeSystem, double weight, double memorySize, double screenSize, int batteryCapacity, boolean camera) {
        this.color = color;
        this.operativeSystem = operativeSystem;
        this.weight = weight;
        this.memorySize = memorySize;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.camera = camera;
    }

    // 3. Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOperativeSystem() {
        return operativeSystem;
    }

    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    // 4. Metodo toString
    @Override
    public String toString() {
        return "SmartDevice{" +
                "color='" + color + '\'' +
                ", operativeSystem='" + operativeSystem + '\'' +
                ", weight=" + weight +
                ", memorySize=" + memorySize +
                ", screenSize=" + screenSize +
                ", batteryCapacity=" + batteryCapacity +
                ", camera=" + camera +
                '}';
    }
}
