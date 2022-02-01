package hw5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillRandomArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }


}
