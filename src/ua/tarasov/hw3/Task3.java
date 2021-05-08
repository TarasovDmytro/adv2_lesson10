package ua.tarasov.hw3;

import java.util.Scanner;

public class Task3<count> {
    public static void main(String[] args) {
        System.out.println("Введите строку для проверки на количество в ней слов:");
        Scanner scan = new Scanner(System.in);
        String strInput = scan.nextLine();
        System.out.println("В строке " + countWords(strInput) + " слов");
    }

    private static int countWords(String strInput) {
        int count = 0;
        for (int i = 1; i < strInput.length(); i++) {
            if (Character.isLetter(strInput.charAt(i))) {
                continue;
            } else {
                if (Character.isLetter(strInput.charAt(i - 1))) {
                    count++;
                    count = (Character.isDigit(strInput.charAt(i)) && Character.isLetter(strInput.charAt(i + 1))) ? (count - 2) : count;
                }
                continue;
            }
        }
        count = (Character.isLetter(strInput.charAt(strInput.length() - 1))) ? count + 1 : count;
        return count;
    }
}
