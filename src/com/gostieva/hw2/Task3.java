package com.gostieva.hw2;

public class Task3 {

    public static void main(String[] args) {
        double a =-12;
        double b = 5;
        double c = 41;
        System.out.println((Math.abs(a)<Math.abs(b))?((Math.abs(a)<Math.abs(c))?a:c):(Math.abs(b)<Math.abs(c))?b:c);
    }
}

