package ua.tarasov.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[][] intArray = new int[3][3];
        fillArray(intArray);
        for (int[] innerArray : intArray) {
            System.out.println(Arrays.toString(innerArray));
        }
        if (orderingCheck(intArray)) {
            System.out.println("Массив упорядочен по невозрастанию");
        } else {
            System.out.println("Массив не упорядочен по невозрастанию");
        }
    }

    private static boolean orderingCheck(int[][] intArray) {
        boolean check = false;
        int temp = intArray[0][0];
        for (int[] ints : intArray) {
            for (int anInt : ints) {
                if (anInt <= temp) {
                    check = true;
                    temp = anInt;
                } else {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    private static int[][] fillArray(int[][] intArray) {
        System.out.println("Задайте значения массива целых чисел [ " + intArray[0].length + " ][ " + intArray.length + " ]");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println("  Введите целое число как элемент массива с индексом [ " + i + ";" + j + " ]:");
                intArray[i][j] = scan.nextInt();
            }
        }
        return intArray;
    }
}
