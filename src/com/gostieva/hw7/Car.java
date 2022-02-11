package com.gostieva.hw7;

public class Car {
    public String manufacturer;
    public String engine;
    public String colour;
    public int petrol;

    Car(String m, String e, String c) {
        manufacturer = m;
        engine = e;
        colour = c;
        petrol = 100;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public void startEngine(String name) {
        System.out.println(name + "Запустил двигатель");
    }

    public boolean isEnoughPetrolLevel(int petrol) {
        return petrol >= 50;

    }
}



