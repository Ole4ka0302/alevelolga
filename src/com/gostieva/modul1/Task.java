package com.gostieva.modul1;

import java.util.Arrays;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillRandomArray(numbers);
        System.out.println(Arrays.toString(numbers));
        sortFromHighToLow(numbers);
        System.out.println(Arrays.toString(numbers));
        thirdInCube(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 101);
        }
    }

    private static void sortFromHighToLow(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException(" Array has size 0.");
        }
        int tempo;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    tempo = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempo;
                }
            }

        }

    }

    private static void thirdInCube(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException(" Array has size 0.");
        }
        for (int i = 2; i < numbers.length; i += 3) {
            numbers[i] = numbers[i] * numbers[i] * numbers[i];
        }
    }
}


