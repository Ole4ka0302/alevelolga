package com.gostieva.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[2000];
        fillRandomArray(numbers);
        System.out.println(Arrays.toString(numbers));
        fillArrayNulls(numbers);
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
        }
    }

    private static void fillArrayNulls(int[] numbers) {
        int nulls = 0;
        int[] newNumbers = numbers.clone();
        for (int i = 0; i < newNumbers.length; i++) {
            if (newNumbers[i] % 2 == 0) {
                newNumbers[i] = nulls;
            }
        }
        System.out.println(Arrays.toString(newNumbers));
    }

}

