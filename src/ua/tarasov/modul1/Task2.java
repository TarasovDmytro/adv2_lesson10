package ua.tarasov.modul1;
// Ход коня по шахматной доске. Вводится текущее положение коня
// и клетка в которую пробуют его передвинуть за 1 ход. Программа должна проверить,
// возможно ли это сделать. *

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = chessBord();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начальное расположение фигуры Конь на шахматной доске (в формате: а1):");
        String firstLocation = scan.next();
        System.out.println("Введите предполагаемое расположение фигуры Конь на шахматной доске (в формате: а1):");
        String nextLocation = scan.next();
        checkTurn(array, firstLocation, nextLocation);
    }

    private static String[][] chessBord() {
        String[][] chessBord = new String[8][8];
        String str = null;
        for (int i = 0; i < chessBord.length; i++) {
            for (int j = 0; j < chessBord[i].length; j++) {
                if (i == 0) str = "h";
                if (i == 1) str = "g";
                if (i == 2) str = "f";
                if (i == 3) str = "e";
                if (i == 4) str = "d";
                if (i == 5) str = "c";
                if (i == 6) str = "b";
                if (i == 7) str = "a";
                chessBord[i][j] = (str + (j + 1));
            }
        }
        return chessBord;
    }

    private static void checkTurn(String[][] array, String startLocation, String finishLocation) {
        int sLocX = getCoordinateX(array, startLocation);
        int sLocY = getCoordinateY(array, startLocation);
        int fLocX = getCoordinateX(array, finishLocation);
        int fLocY = getCoordinateY(array, finishLocation);
        if (Math.abs(fLocX - sLocX) == 2 && Math.abs(fLocY - sLocY) == 1 || Math.abs(fLocX - sLocX) == 1 && Math.abs(fLocY - sLocY) == 2) {
            System.out.println("Да, такой ход возможен!");
        } else {
            System.out.println("Нет, такой ход не возможен!");
        }
    }

    private static int getCoordinateX(String[][] array, String str) {
        int x = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (str.equals(array[i][j])) {
                    x = i;
                    break;
                }
            }
        }
        if (x == -1) {
            System.out.println("Это за пределами доски!");
        }
        return x;
    }

    private static int getCoordinateY(String[][] array, String str) {
        int y = 0;
        for (String[] strings : array) {
            for (int j = 0; j < array.length; j++) {
                if (str.equals(strings[j])) {
                    y = j;
                    break;
                }
            }
        }
        return y;
    }

}


