package ua.tarasov.modul1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = Chess.chessBord();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начальное расположение фигуры Конь на шахматной доске (в формате: а1):");
        String firstLocation = scan.next();
        System.out.println("Введите предполагаемое расположение фигуры Конь на шахматной доске (в формате: а1):");
        String nextLocation = scan.next();
        Chess.checkTurn(array, firstLocation, nextLocation);
    }
}


