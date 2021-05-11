package ua.tarasov.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] intArray = new int[1000];
        fillRandArray(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("В массиве " + countComposite(intArray) + " составных чисел");
    }

    private static void fillRandArray(int[] intArray) {
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(100000);
        }
    }

    private static int countComposite(int[] intArray) {
        int count = 0;
        for (int value : intArray) {
            if (value > 1) {
                for (int j = 2; j < value; j++) {
                    if (value % j == 0) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
