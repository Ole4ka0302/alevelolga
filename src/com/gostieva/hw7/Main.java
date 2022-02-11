package com.gostieva.hw7;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari","Started","Blue");
        Car car2 = new Car("Toyota", "Stopped","Green");
        System.out.println(car1.manufacturer+","+ car1.engine+","+car1.colour+","+car1.petrol);
        System.out.println(car2.manufacturer+","+car2.engine+","+car2.colour+","+car2.petrol);
        car1.setManufacturer("BMW");
        car1.setEngine("Started");
        car1.setColour("Black");
        car1.setPetrol(60);
        System.out.println(car1.manufacturer+","+car1.engine+","+car1.colour+","+car1.petrol);
        car2.setManufacturer("Mazda");
        car2.setEngine("Started");
        car2.setColour(" Red");
        car2.setPetrol(105);
        System.out.println(car2.manufacturer+","+car2.engine+","+car2.colour+","+car2.petrol);


        System.out.println(car1.isEnoughPetrolLevel(90));
        System.out.println(car2.isEnoughPetrolLevel(25));
        car1.startEngine("John ");
        car2.startEngine("Jane ");

    }
}
