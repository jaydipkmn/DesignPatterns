package com.myownphone;

public class Phone {

    private String OS;
    private int battery;
    private double screen;
    private String name;
    public Phone(String oS, int battery, double screen, String name) {
        super();
        OS = oS;
        this.battery = battery;
        this.screen = screen;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Phone [OS=" + OS + ", battery=" + battery + ", screen=" + screen + ", name=" + name + "]";
    }
    
}
