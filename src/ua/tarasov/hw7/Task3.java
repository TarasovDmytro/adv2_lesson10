package ua.tarasov.hw7;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        MyVector vector = new MyVector(2, 3, 5);
        MyVector vector1 = new MyVector(4, 9, 0);
        Arrays.stream(MyVector.arrayVector(3)).map(myVector -> "{ " + myVector.coordinateX + " ; " + myVector.coordinateY + " ; " + myVector.coordinateZ + " }").forEachOrdered(System.out::println);
        vector.vectorLength(vector);
        vector.multiVector(vector, vector1);
    }
}
