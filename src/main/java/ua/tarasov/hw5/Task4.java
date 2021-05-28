package ua.tarasov.hw5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.println("Первоначальный массив:");
        System.out.println(Arrays.toString(fillRandArray(intArray)));
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите какой по счету элемент нужно удалить:");
        int k = scan.nextInt();
        System.out.println("Новый массив после удаления " + k + " - го элемента первоначального массива:");
        System.out.println(Arrays.toString(delElemArray(intArray, k)));
        System.out.println("Первоначальный массив при этом не изменился:");
        System.out.println(Arrays.toString(intArray));
    }

    private static int[] delElemArray(int[] intArray, int k) {
        k = k - 1;
        int[] delArray = new int[intArray.length - 1];
        for (int i = 0; i < intArray.length; i++) {
            delArray[i] = intArray[i];
            if (i == k) {
                break;
            }
        }
        IntStream.range(k, delArray.length).forEachOrdered(j -> delArray[j] = intArray[j + 1]);
        return delArray;
    }

    private static int[] fillRandArray(int[] intArray) {
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(10);
        }
        return intArray;
    }

}
