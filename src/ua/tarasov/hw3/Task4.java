package ua.tarasov.hw3;

//Программа "Угадай число"
//        Задача
//        Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.
//
//        Решение
//        Описание переменных:
//
//        a – число, "загаданное" компьютером;
//        b – очередное число, вводимое пользователем.
//
//        Алгоритм решения задачи:
//
//        Программа генерирует псевдослучайное число, которое записывается в переменную a.
//
//        Пока число a не совпадет с числом b, пользователю будет предлагаться ввести очередное
//        число. При этом, если b > a, то на экран будет выдаваться сообщение "Много". Иначе
//        будет проверяться условие b < a.
//        При его положительном значении появится сообщение "Мало", иначе сообщение "Угадал".

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Задайте границы диапозона целых чисел\nmax: ");
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        System.out.print("min: ");
        int min = scan.nextInt();
        int a = (int) (min + Math.random() * (max - min + 1));

        guessNum(scan, a, min, max);
    }

    private static void guessNum(Scanner scan, int a, int min, int max) {
        System.out.println("Угадайте число в диапозоне [ " + min + ";" + max + " ]");
        System.out.print("Введите Ваше число: ");
        int b = scan.nextInt();
        while (b > a) {
            System.out.print("Много, попробуйте еще раз: ");
            b = scan.nextInt();
        }
        while (b < a) {
            System.out.print("Мало, попробуйте еще раз: ");
            b = scan.nextInt();
        }
        System.out.println("УРАААА! Угадал!");


    }
}


