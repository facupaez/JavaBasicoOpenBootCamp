package com.company;

public class SmartWatch extends SmartDevice{

    private boolean bluetooth;
    private boolean antiLostAlert;
    private boolean bloodPressureControl;
    private boolean stepCounter;

    public SmartWatch() {}

    public SmartWatch(boolean bluetooth, boolean antiLostAlert, boolean bloodPressureControl, boolean stepCounter) {
        this.bluetooth = bluetooth;
        this.antiLostAlert = antiLostAlert;
        this.bloodPressureControl = bloodPressureControl;
        this.stepCounter = stepCounter;
    }

    //constructor super
    public SmartWatch(String color, String operativeSystem, double weight, double memorySize, double screenSize,
                      int batteryCapacity, boolean camera, boolean bluetooth, boolean antiLostAlert,
                      boolean bloodPressureControl, boolean stepCounter) {
        super(color, operativeSystem, weight, memorySize, screenSize, batteryCapacity, camera);
        this.bluetooth = bluetooth;
        this.antiLostAlert = antiLostAlert;
        this.bloodPressureControl = bloodPressureControl;
        this.stepCounter = stepCounter;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isAntiLostAlert() {
        return antiLostAlert;
    }

    public void setAntiLostAlert(boolean antiLostAlert) {
        this.antiLostAlert = antiLostAlert;
    }

    public boolean isBloodPressureControl() {
        return bloodPressureControl;
    }

    public void setBloodPressureControl(boolean bloodPressureControl) {
        this.bloodPressureControl = bloodPressureControl;
    }

    public boolean isStepCounter() {
        return stepCounter;
    }

    public void setStepCounter(boolean stepCounter) {
        this.stepCounter = stepCounter;
    }

    // toString con clase padre concatenado
    @Override
    public String toString() {
        return "SmartWatch{" +
                "color='" + color + '\'' +
                ", operativeSystem='" + operativeSystem + '\'' +
                ", weight=" + weight +
                ", memorySize=" + memorySize +
                ", screenSize=" + screenSize +
                ", batteryCapacity=" + batteryCapacity +
                ", camera=" + camera +
                ", bluetooth=" + bluetooth +
                ", antiLostAlert=" + antiLostAlert +
                ", bloodPressureControl=" + bloodPressureControl +
                ", stepCounter=" + stepCounter +
                '}';
    }
}
