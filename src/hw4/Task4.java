package hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[2000];
        fillRandomArray(numbers);
        System.out.println(Arrays.toString(numbers));
        fillArrayNulls(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
        }
    }

    private static void fillArrayNulls(int[] numbers) {
        int nulls=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = nulls;
            }
        }
    }
}
