package ua.tarasov.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] intArray = new int[10];
        fillRandArray(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("В массиве " + countPrime(intArray) + " простых чисел");
    }

    private static void fillRandArray(int[] intArray) {
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(10);
        }
    }

    private static int countPrime(int[] intArray) {
        int count = 0;
        for (int value : intArray) {
            if (value > 1) {
                boolean primeNum = true;
                for (int j = 2; j < value; j++) {
                    if (value % j == 0) {
                        primeNum = false;
                        break;
                    } else {
                        primeNum = true;
                    }
                }
                if (primeNum) {
                    count++;
                }
            }
        }
        return count;
    }
}
