package ua.tarasov.hw7;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        MyVector vector = new MyVector(2, 3, 5);
        MyVector vector1 = new MyVector(4, 9, 0);

        double vectorLength = vector.vectorLength(vector);
        System.out.println("\n" + "|{ " + vector.coordinateX + " ; " + vector.coordinateY + " ; " + vector.coordinateZ + " }| = " + vectorLength);

        MyVector vectorProduct = vector.vectorProductOfVectors(vector, vector1);
        System.out.println("\n" + "{ " + vector.coordinateX + " ; " + vector.coordinateY + " ; " + vector.coordinateZ + " } * { "
                + vector1.coordinateX + " ; " + vector1.coordinateY + " ; " + vector1.coordinateZ + " } = { "
                + vectorProduct.coordinateX + " ; " + vectorProduct.coordinateY + " ; " + vectorProduct.coordinateZ + " }");

        double cosAngle = vector.cosAngleBetweenVectors(vector, vector1);
        System.out.println("\n" + "cosine of angle between vectors { " + vector.coordinateX + " ; " + vector.coordinateY + " ; " + vector.coordinateZ
                + " } & { " + vector1.coordinateX + " ; " + vector1.coordinateY + " ; " + vector1.coordinateZ + " } = " + cosAngle);

        MyVector addVector = vector.addOfVectors(vector, vector1);
        System.out.println("\n" + "{ " + vector.coordinateX + " ; " + vector.coordinateY + " ; " + vector.coordinateZ + " } + { "
                + vector1.coordinateX + " ; " + vector1.coordinateY + " ; " + vector1.coordinateZ + " } = { "
                + addVector.coordinateX + " ; " + addVector.coordinateY + " ; " + addVector.coordinateZ + " }");

        MyVector subVector = vector.subOfVectors(vector, vector1);
        System.out.println("\n" + "{ " + vector.coordinateX + " ; " + vector.coordinateY + " ; " + vector.coordinateZ + " } - { "
                + vector1.coordinateX + " ; " + vector1.coordinateY + " ; " + vector1.coordinateZ + " } = { "
                + subVector.coordinateX + " ; " + subVector.coordinateY + " ; " + subVector.coordinateZ + " }");

        System.out.println("\n" + "array of random vectors:");
        Arrays.stream(MyVector.arrayVector(3)).map(myVector -> "{ " + myVector.coordinateX + " ; " + myVector.coordinateY +
                " ; " + myVector.coordinateZ + " }").forEachOrdered(System.out::println);
    }
}
