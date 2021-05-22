package ua.tarasov.modul1;
// Ход коня по шахматной доске. Вводится текущее положение коня
// и клетка в которую пробуют его передвинуть за 1 ход. Программа должна проверить,
// возможно ли это сделать. *

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            array[i][1] = ("a" + i);
            array[i][1] = ("b" + i);
            array[i][1] = ("c" + i);
            array[i][1] = ("d" + i);
            array[i][1] = ("e" + i);
            array[i][1] = ("f" + i);
            array[i][1] = ("g" + i);
            array[i][1] = ("h" + i);
        }
        System.out.println(Arrays.toString(array));
    }
}
