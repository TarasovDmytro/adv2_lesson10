package ua.tarasov.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] intArray = new int[5][5];
        fillRandArray(intArray);
        System.out.println("Первоначальный массив:");
        for (int[] innerArray : intArray) {
            System.out.println(Arrays.toString(innerArray));
        }
        int[][] reversArray = changeArray(intArray);
        System.out.println("Новый массив развернутый относительно первоначального:");
        for (int[] innerArray : reversArray) {
            System.out.println(Arrays.toString(innerArray));
        }
        System.out.println("Первоначальный массив не изменился:");
        for (int[] innerArray : intArray) {
            System.out.println(Arrays.toString(innerArray));
        }
    }

    private static int[][] changeArray(int[][] intArray) {
        int[][] tempArray = new int[intArray[0].length][intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                tempArray[j][i] = intArray[i][j];
            }
        }
        return tempArray;
    }

    private static void fillRandArray(int[][] intArray) {
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = rand.nextInt(100);
            }
        }
    }
}

