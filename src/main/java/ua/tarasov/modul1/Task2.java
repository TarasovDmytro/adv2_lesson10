package ua.tarasov.modul1;

import java.util.Scanner;


public class Task2 {


    private static Object ConverterChessCoordinatesToIndexes;


    public Task2(Object converterChessCoordinatesToIndexes) {
    }

    public Task2() {
    }

    public static void main(String[] args) {
        ConverterChessCoordinatesToIndexes coordinates = new ConverterChessCoordinatesToIndexes();
        Chess validate = new Chess();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начальное расположение фигуры Конь на шахматной доске (в формате: а1):");
        String firstLocation = scan.next();
        int firstIndexI = coordinates.getIndexI(firstLocation);
        int firstIndexJ = coordinates.getIndexJ(firstLocation);
        System.out.println("Введите предполагаемое расположение фигуры Конь на шахматной доске (в формате: а1):");
        String nextLocation = scan.next();
        int nextIndexI = coordinates.getIndexI(nextLocation);
        int nextIndexJ = coordinates.getIndexJ(nextLocation);
        if (validate.checkTurn(firstIndexI, firstIndexJ, nextIndexI, nextIndexJ)) {
            System.out.println("Да, такой ход возможен!");
        } else {
            System.out.println("Такой ход не возможен!");
        }
    }


    static class ConverterChessCoordinatesToIndexes {

         static String[][] chessBord() {
            String[][] chessBord = new String[8][8];
            String str = null;
            for (int i = 0; i < chessBord.length; i++) {
                for (int j = 0; j < chessBord[i].length; j++) {
                    if (i == 0) str = "a";
                    if (i == 1) str = "b";
                    if (i == 2) str = "c";
                    if (i == 3) str = "d";
                    if (i == 4) str = "e";
                    if (i == 5) str = "f";
                    if (i == 6) str = "g";
                    if (i == 7) str = "h";
                    chessBord[i][j] = (str + (j + 1));
                }
            }
            return chessBord;
        }
        static int getIndexI(String str) {
            int indexI = -1;
            for (int i = 0; i < chessBord().length; i++) {
                for (int j = 0; j < chessBord().length; j++) {
                    if (str.equals(chessBord()[i][j])) {
                        indexI = i;
                        break;
                    }
                }
            }
//            if (indexI == -1) {
//                System.out.println("Это за пределами доски!");
//            }
            return indexI;
        }

        static int getIndexJ(String str) {
            int indexJ = 0;
            for (String[] strings : chessBord()) {
                for (int j = 0; j < chessBord().length; j++) {
                    if (str.equals(strings[j])) {
                        indexJ = j;
                        break;
                    }
                }
            }
            return indexJ;
        }
    }
}


