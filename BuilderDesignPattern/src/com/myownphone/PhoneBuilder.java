package com.myownphone;

public class PhoneBuilder {
    private String OS;
    private int battery;
    private double screen;
    private String name;
    public PhoneBuilder setOS(String oS) {
        this.OS = oS;
        return this;
    }
    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public PhoneBuilder setScreen(double screen) {
        this.screen = screen;
        return this;
    }
    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    public Phone getPhone()
    {
        return new Phone(OS,battery,screen,name);
    }
}
