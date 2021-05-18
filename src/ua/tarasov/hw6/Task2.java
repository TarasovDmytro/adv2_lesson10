package ua.tarasov.hw6;

// Поскольку при запуске программы выдает ошибку выхода за пределы массива,
// предположил, что сбой происходит при работе циклов, используемых для перебора элементов массива.
// Поэтому поставил line breakpoint для проверки значений на 26 и 34 строки и запустил дебаг.
// Первые два цикла в строке 26 программа прошла без ошибок, а в строке 34 выдала
// ошибку выхода за пределы массива при i = 0 и j = 1, поскольку в строке с индексом 0 массив имеет
// всего один элемент, имеющий индекс j = 0. Значит в цикле неправильно заданно ограничение по колличеству элементов
// в строке i с индексом j. И действительно, в строке 34 по ошибке для вычесления колличества циклических операций
// вместо переменной j в выражении j < triangle[i].length стояла переменная i.

public class Task2 {

    public static void main(String[] args) {
        int[][] triangle = new int[5][];

        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];

        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }

        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }

    }
}

