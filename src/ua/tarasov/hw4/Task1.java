package ua.tarasov.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] intArray = new int[400];
        fillRandArray(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("Average = " + averAge(intArray));
        System.out.println("Geometric mean = " + geoMean(intArray));
    }

    private static void fillRandArray(int[] intArray) {
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt();
        }
    }

    private static double geoMean(int[] intArray) {
        double sum = 0;
        for (int value : intArray) {
            sum += value;
        }
        return Math.pow(sum, (1.0 / intArray.length));
    }

    private static double averAge(int[] intArray) {
        double sum = Arrays.stream(intArray).asDoubleStream().sum();
        return sum / intArray.length;
    }
}
