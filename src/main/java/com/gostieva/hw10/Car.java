package com.gostieva.hw10;

import com.gostieva.hw7.Recovery;

public class Car {
    public String series;
    public int year;
    public String color;
    public int petrol;

    public Car(String series, int year, String color, int petrol) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.petrol = petrol;
    }

    public void drive(int petrol) {
        if (petrol > 0) {
            System.out.println("Drive");
        } else if (petrol == 0) {
            System.out.println("Stopped");
        }

    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 2020, "Green", 80);
        car.drive(0);
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