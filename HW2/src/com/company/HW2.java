package com.company;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args ){
        System.out.println("Triangles square is " + squareTr());
        System.out.println("*********************");
        System.out.println("entered number is " + evenNumber());
        System.out.println("*********************");
        System.out.println("Minimum modulo number is " + minNumber());
    }

    public static double squareTr(){
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

    public static String evenNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer number:");
        int n = scan.nextInt();
        String ev = (n%2==0?"even":"not even");
        return ev;
    }

    public static double minNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 real numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double tmp = (Math.abs(a)<Math.abs(b)?a:b);
        double min = (Math.abs(tmp)<Math.abs(c)?tmp:c);
        return min;

    }
}
