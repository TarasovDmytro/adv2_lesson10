package ua.tarasov.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Triangles square is " + squareTr());
    }

    public static double squareTr() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coordinates of triangle (x1 y1 x2 y2 x3 y3):");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        System.out.println("Coordinates of triangle:");
        System.out.println("(" + x1 + "," + y1 + ") ; (" + x2 + "," + y2 + ") ; (" + x3 + "," + y3 + ")");
        return Math.abs(((x1 - x3) * (y2 - y1) - (x1 - x2) * (y3 - y1)) * 0.5);
    }
}
