package ua.tarasov.modul1;
// Найти количество различных элементов массива.
// Пример: для 1 4 5 1 1 3 ответ 4.
//*Создать метод, который принимает массив и возвращает количество. *

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 3};
        System.out.println(difNumberArray(array));
    }

    private static int difNumberArray(int[] array) {
        int sameCount = 0;
        int count = 0;
        int difCount = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    sameCount++;
                    break;
                }
            }
        }
        difCount = count - sameCount
        return difCount;
    }
}
