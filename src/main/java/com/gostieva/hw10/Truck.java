package com.gostieva.hw10;

import com.gostieva.hw7.Recovery;

public class Truck extends Car {
    private int cargo;

    public Truck(String series, int year, String color, int petrol, int cargo) {
        super(series, year, color, petrol);
        this.cargo = cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
        System.out.println("Setting cargo" + cargo);
    }

    public void outputCargo(int cargo) {
        this.cargo = cargo;
        System.out.println("Output cargo" + cargo);
    }

    @Override
    public void drive(int petrol) {
        super.drive(petrol);
        if (petrol > 0) {
            petrol = petrol * 2;
        }
        System.out.println(petrol);
    }

    public static void main(String[] args) {
        Truck truck = new Truck("LKW", 2010, "White", 0, 800);
        truck.drive(250);
        truck.outputCargo(500);
        truck.setCargo(400);
        Recovery recovery = new Recovery() {
            @Override
            public int refuel(int petrol) {
                if (petrol == 0)
                    System.out.println("Full refuel");
                return petrol;
            }

        };
        int result = recovery.refuel(0);
        System.out.println(result);
    }
}

