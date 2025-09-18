package com.smartHomeDevices.gla;
public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH-101", "Online", 24);
        t1.displayStatus();
        
    }
}