package com.company;

public class SmartPhone extends SmartDevice {

    private String connectivity;
    private boolean wifi;
    private boolean bluetooth;
    private boolean flashlight;

    public SmartPhone() {
    }

    public SmartPhone(String connectivity, boolean wifi, boolean bluetooth, boolean flashlight) {
        this.connectivity = connectivity;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.flashlight = flashlight;
    }

    //constructor super
    public SmartPhone(String color, String operativeSystem, double weight, double memorySize, double screenSize,
                      int batteryCapacity, boolean camera, String connectivity, boolean wifi,
                      boolean bluetooth, boolean flashlight) {
        super(color, operativeSystem, weight, memorySize, screenSize, batteryCapacity, camera);
        this.connectivity = connectivity;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.flashlight = flashlight;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isFlashlight() {
        return flashlight;
    }

    public void setFlashlight(boolean flashlight) {
        this.flashlight = flashlight;
    }

    // toString con clase padre concatenado
    @Override
    public String toString() {
        return "SmartPhone{" +
                "color='" + color + '\'' +
                ", operativeSystem='" + operativeSystem + '\'' +
                ", weight=" + weight +
                ", memorySize=" + memorySize +
                ", screenSize=" + screenSize +
                ", batteryCapacity=" + batteryCapacity +
                ", camera=" + camera +
                ", connectivity='" + connectivity + '\'' +
                ", wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                ", flashlight=" + flashlight +
                '}';
    }
}
