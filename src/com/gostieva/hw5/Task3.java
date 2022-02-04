package com.gostieva.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        fillArray(numbers);
        for (int[] number : numbers) {
            System.out.println(Arrays.toString(number));
        }
            arraysCopy(numbers);
        }

        private static void fillArray ( int[][] array){
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(100);
                }
            }

        }

        private static void arraysCopy ( int[][] array){
            int[][] newNumbers = new int[array.length][];
            for (int i = 0; i < array.length; i++) {
                newNumbers[i] = Arrays.copyOf(array[i], array[i].length);
            }
            for (int[] number : newNumbers) {
                System.out.println(Arrays.toString(number));
            }
        }
    }

