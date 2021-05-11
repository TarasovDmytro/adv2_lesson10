package ua.tarasov.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] intArray = new int[2000];
        fillRandArray(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(zeroReplacement(intArray)));
    }

    private static void fillRandArray(int[] intArray) {
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(100000);
        }
    }

    public static int[] zeroReplacement(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                intArray[i] = 0;
            }
        }
        return intArray;
    }
}
