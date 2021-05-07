package ua.tarasov.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите строку для проверки на количество в ней слов:");
        Scanner scan = new Scanner(System.in);
        String strInput = scan.nextLine();
        System.out.println("В строке " + numSpases(strInput) + " слов");
    }

    private static int numSpases(String strInput) {
        int word = 1;
        for (int i = 0; i < strInput.length(); i++) {
            word += (Character.isWhitespace(strInput.charAt(i))) ? 1 : 0;
        }
        return word;


    }
}
