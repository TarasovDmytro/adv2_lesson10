package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public  static void main (String[] args){
        System.out.print("Enter a number, please:");
        Scanner scan = new Scanner(System.in);
        String strNum = scan.next();
        StringBuilder revNumber = new StringBuilder(strNum).reverse();
        System.out.println("Thank you, revers number is " + revNumber);
        }
    }