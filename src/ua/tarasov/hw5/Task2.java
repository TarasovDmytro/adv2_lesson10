package ua.tarasov.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        fillArray(intArray);
        System.out.println(Arrays.toString(intArray));
        if (orderingCheck(intArray)) {
            System.out.println("Массив упорядочен по невозрастанию");
        } else {
            System.out.println("Массив не упорядочен по невозрастанию");
        }
    }

    private static boolean orderingCheck(int[] intArray) {
        boolean check = false;
        int temp = intArray[0];
        for (int i : intArray) {
            if (i <= temp) {
                check = true;
                temp = i;
            } else {
                check = false;
                break;
            }
        }
        return check;
    }

    private static int[] fillArray(int[] intArray) {
        System.out.println("Задайте значения массива целых чисел [ " + intArray.length + " ]");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("  Введите целое число как элемент массива с индексом [ " + i + " ]:");
            intArray[i] = scan.nextInt();
        }
        return intArray;
    }
}
