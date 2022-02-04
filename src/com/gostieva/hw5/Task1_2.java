package com.gostieva.hw5;

import java.util.Arrays;

public class Task1_2 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][3];
        fillArray(numbers);
        for (int[] number : numbers) {
            System.out.println(Arrays.toString(number));
        }
        checkForDisorder(numbers);
    }


    private static void fillArray(int[][] array) {
        int s = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = s++;

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 != 0) {
                    array[i][j] *= -1;
                }
            }
        }
    }

    private static void checkForDisorder(int[][] numbers) {
        System.out.println(Arrays.deepToString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

            }
        }


    }

}