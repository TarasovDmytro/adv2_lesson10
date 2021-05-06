package ua.tarasov.hw1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter a number, please:");
        Scanner scan = new Scanner(System.in);
        String strNum = scan.next();
        System.out.println("Thank you, revers number is " + new StringBuilder(strNum).reverse());
    }
}
