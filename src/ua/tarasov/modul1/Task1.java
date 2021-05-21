package ua.tarasov.modul1;
// Найти количество различных элементов массива.
// Пример: для 1 4 5 1 1 3 ответ 4.
//*Создать метод, который принимает массив и возвращает количество. *

public class Task1 {
    public static void main(String[] args) {
        int[] array ={1, 4, 3, 1, 1, 4, 4};
        int count = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length-1; j++) {
                if (array[i] != array[j + 1]){
                    count -= 1;
                }count +=array.length -  count;
            }
        } System.out.println(count);
    }
}
