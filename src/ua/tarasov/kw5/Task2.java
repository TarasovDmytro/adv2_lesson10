package ua.tarasov.kw5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[][] intArray = new int[5][5];
        fillRandArray(intArray);
        for (int[] innerArray : intArray) {
            System.out.println(Arrays.toString(innerArray));
        }
        System.out.println("Сумма єлементов диагонали " + sumElements(intArray));
    }

    private static int sumElements(int[][] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (i == j) {
                    sum += intArray[i][j];
                }
            }

        }
        return sum;
    }

    private static void fillRandArray(int[][] intArray) {
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                intArray[i][j] = rand.nextInt(100);
            }
        }
    }
}
