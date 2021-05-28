package ua.tarasov.modul1;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {-1, 1, 1, 2, 2, 3, 4, -5, -5, 0, 0, -1, -1, -1, -1, -1, 2, 2};
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
        difCount = count - sameCount;
        return difCount;
    }
}
