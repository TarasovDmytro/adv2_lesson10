package ua.tarasov.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("entered number is " + evenNumber());
    }

    public static String evenNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer number:");
        int n = scan.nextInt();
        String ev = (n % 2 == 0 ? "even" : "not even");
        return ev;
    }
}
