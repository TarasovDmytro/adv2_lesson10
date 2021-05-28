package ua.tarasov.hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Minimum modulo number is " + minNumber());
    }

    public static double minNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 real numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double tmp = (Math.abs(a) < Math.abs(b) ? a : b);
        double min = (Math.abs(tmp) < Math.abs(c) ? tmp : c);
        return min;
    }
}
