package hw4;

import java.util.Arrays;
import java.util.Random;


public class Task2_3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillRandomArray(numbers);
        System.out.println(Arrays.toString(numbers));
        calcPrimeAndMulti(numbers);
        System.out.println();

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
        int multi = 0;
        int prime = 0;
        for (int number : numbers) {
            if (number <= 1)
                break;
            else {
                for (int j = 2; j <= number; j++) {
                    if (number % j == 0) {
                        multi++;
                        break;
                    } else {
                        prime++;
                    }
                }
            }
        }
        System.out.println(multi);
        System.out.println(prime);
    }
}





