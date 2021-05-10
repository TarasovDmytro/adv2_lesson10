package ua.tarasov.hw4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArray = new int[2000];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt();
        }
        int[] modifiedArray = zeroReplacement(intArray);
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
