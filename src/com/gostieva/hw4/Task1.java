package com.gostieva.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[400];
        fillRandomArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(findMiddleOfNumArray(numbers));
        System.out.println(findMiddleOfNumOfArray(numbers));
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,11);
        }
    }

    private static double findMiddleOfNumArray(int[] numbers) {
        double middle = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            middle = sum / numbers.length;
        }
        return middle;
    }

    private static double findMiddleOfNumOfArray(int[] numbers) {
        double middle = 0;
        if (numbers.length > 0) {
            double mult = 1.0;
            for (int number : numbers) {
                mult *= number;
            }
            middle = Math.pow(mult, 1.0/ numbers.length);
        }
        return middle;
    }
}