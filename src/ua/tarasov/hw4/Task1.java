package ua.tarasov.hw4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArray = new int[400];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt();
        }
        System.out.println("Average = " + averAge(intArray));
        System.out.println("Geometric mean = " + geoMean(intArray));
    }

    private static double geoMean(int[] intArray) {
        double sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return Math.pow(sum, (1.0 / intArray.length));
    }

    private static double averAge(int[] intArray) {
        double sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum / intArray.length;
    }
}
