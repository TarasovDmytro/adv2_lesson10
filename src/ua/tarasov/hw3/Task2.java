package ua.tarasov.hw3;
//        Удалить из строки пробелы и определить, является ли она перевертышем
//        Ввести строковую переменную. Удалить из нее все пробелы.
//        После этого определить, является ли она палиндромом (перевертышем),
//        т.е. одинаково пишется как с начала, так и с конца.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите строку для проверки - является ли она палиндромом:");
        Scanner scan = new Scanner(System.in);
        String strInput = scan.nextLine();
        checkPal(strInput);
    }

    private static void checkPal(String strInput) {

        String strChange = strInput.replaceAll("\\s", "");
        StringBuilder stReverse = new StringBuilder(strChange).reverse();
        if (strChange.equalsIgnoreCase(String.valueOf(stReverse))) {
            System.out.println("Введенная строка является палиндромом");
        } else {
            System.out.println("Введенная строка не является палиндромом");
        }

    }

}
