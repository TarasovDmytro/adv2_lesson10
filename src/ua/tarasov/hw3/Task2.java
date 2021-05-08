package ua.tarasov.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите строку для проверки - является ли она палиндромом:");
        Scanner scan = new Scanner(System.in);
        String strInput = scan.nextLine();
        String strChange = delSpace(strInput);
        System.out.println("Введенная строка " + checkPol(strChange) + " палиндромом");
    }

    private static String delSpace(String strInput) {
        String outSpace = strInput.replaceAll("\\s", "");
        return outSpace;
    }

    private static String checkPol(String strChange) {
        String result;
        StringBuilder stReverse = new StringBuilder(strChange).reverse();
        if (strChange.equalsIgnoreCase(String.valueOf(stReverse))) {
            result = "является";
        } else {
            result = "не является";
        }
        return result;
    }

}
