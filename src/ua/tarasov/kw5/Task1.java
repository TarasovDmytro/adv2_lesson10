package ua.tarasov.kw5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] intArray = new int[20];
        fillRandArray(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("Максимальное значение " + maxVal(intArray));
    }

    private static void fillRandArray(int[] intArray) {
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(100);
        }
    }

    private static int maxVal(int[] intArray) {
        int max = Integer.MIN_VALUE;
        for (int number : intArray) {
            if (number > max) {
                if (checkRull(number)) {
                    max = number;
                }
            }
        }
        return max;
    }

    private static boolean checkRull(int intArray) {
        return intArray % 3 == 0 || intArray % 7 == 0;
    }

}