package com.gostieva.hw10;

public class PassengerCar extends Car {
    private final int passengerCar;

    public PassengerCar(String series, int year, String color, int petrol, int passengerCar) {
        super(series, year, color, petrol);
        this.passengerCar=passengerCar;
    }

    public void settingPassengerCar(int passengerCar) {
        if (passengerCar > 3) {
            System.out.println("Too much passengers");
        }
        else{
            System.out.println("We can drive!");
        }
    }


    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("Mazda",
                2020, "Red", 150, 3);
        passengerCar.settingPassengerCar(2);
    }
}
