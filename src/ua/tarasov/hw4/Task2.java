package ua.tarasov.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
//        int[] intArray = new int[] {-3, 0, 1, -5, 3, -7, -55, 6, -7, 8, 19};
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt();
        }
        System.out.println(Arrays.toString(intArray));
        System.out.println(countPrime(intArray));

    }

    private static int countPrime(int[] intArray) {
        int count = 0;
        boolean prime = false;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 1) {
                for (int j = 2; j < intArray[i]; j++) {
                    if (intArray[i] % j == 0) {
                        prime = false;
                        break;
                    } else {
                        prime = true;
                    }
                }
                if (prime) {
                    count++;
                }
            }
        }
        return count;
    }
}
