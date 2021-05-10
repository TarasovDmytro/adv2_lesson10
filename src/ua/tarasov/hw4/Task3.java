package ua.tarasov.hw4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArray = new int[1000];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt();
        }
        System.out.println("В массиве " + countComposite(intArray) + " составных чисел");
    }

    private static int countComposite(int[] intArray) {
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 1) {
                for (int j = 2; j < intArray[i]; j++) {
                    if (intArray[i] % j == 0) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
