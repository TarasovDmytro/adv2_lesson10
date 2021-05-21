package ua.tarasov.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] indexArray = new int[10][10];
        for (int[] innerArray : fillIndexArray(indexArray)) {
            System.out.println(Arrays.toString(innerArray));
        }
    }

    private static int[][] fillIndexArray(int[][] indexArray) {
        for (int i = 0; i < indexArray.length; i++) {
            for (int j = 0; j < indexArray[i].length; j++) {
                if (i % 2 != 0) {
                    indexArray[i][j] = -j;
                } else {
                    indexArray[i][j] = j;
                }
            }
        }
        return indexArray;
    }
}
