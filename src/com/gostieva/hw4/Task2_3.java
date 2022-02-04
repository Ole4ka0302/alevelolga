package com.gostieva.hw4;

import java.util.Arrays;
import java.util.Random;


public class Task2_3 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        fillRandomArray(numbers);
        System.out.println(Arrays.toString(numbers));
        calcPrimeAndMulti(numbers);
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static void calcPrimeAndMulti(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException(" Array has size 0.");
        }
        int countPrime = 0;
        int countMulti = 0;
        for (int number : numbers) {
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= number / 2; j++) {
                    if (number % j == 0) {
                        isPrime = false;
                        countMulti++;
                        break;
                    }
                }
            }
            if (isPrime) {
                countPrime++;
            }

        }
        System.out.println(countPrime + " Простые числа");
        System.out.println(countMulti + " Составные числа");
    }
}





