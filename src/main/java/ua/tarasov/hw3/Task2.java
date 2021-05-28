package ua.tarasov.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите строку для проверки - является ли она палиндромом:");
        Scanner scan = new Scanner(System.in);
        String strInput = scan.nextLine();
        String strChange = delSpace(strInput);
        String chekPol = (checkPol(strChange) ? "является" : "не является");
        System.out.println("Введенная строка " + chekPol + " палиндромом");
    }

    private static String delSpace(String strInput) {
        String outSpace = strInput.replaceAll("\\s", "");
        return outSpace;
    }

    private static boolean checkPol(String strChange) {
        StringBuilder stReverse = new StringBuilder(strChange).reverse();
        return strChange.equalsIgnoreCase(String.valueOf(stReverse));
    }

}
