package ua.tarasov.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(intArray));
        System.out.println("Average = " + averAge(intArray));
        System.out.println("Geometric mean = " + geoMean(intArray));
    }

    private static void fillRandArray(int[] intArray) {
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(10);
        }
    }

    private static double geoMean(int[] intArray) {
        double productElem = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            productElem *= intArray[i];
        }
        return Math.pow(productElem, (1.0 / intArray.length));
    }

    private static double averAge(int[] intArray) {
        double sum = Arrays.stream(intArray).asDoubleStream().sum();
        return sum / intArray.length;
    }
}
