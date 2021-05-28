package ua.tarasov.hw7;

import java.util.Random;

public class MyVector {
    double coordinateX;
    double coordinateY;
    double coordinateZ;

    public MyVector(double coordinateX, double coordinateY, double coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    static double vectorLength(MyVector vector) {
        double vectorLength = Math.sqrt(vector.coordinateX * vector.coordinateX + vector.coordinateY * vector.coordinateY +
                vector.coordinateZ * vector.coordinateZ);
        return vectorLength;
    }

    static MyVector vectorProductOfVectors(MyVector vector, MyVector otherVector) {
        MyVector vectorProductOfVectors = new MyVector((vector.coordinateY * otherVector.coordinateZ - vector.coordinateZ *
                otherVector.coordinateY), (vector.coordinateZ * otherVector.coordinateX - vector.coordinateX * otherVector.coordinateZ),
                (vector.coordinateX * otherVector.coordinateY - vector.coordinateY * otherVector.coordinateX));
        return vectorProductOfVectors;
    }

    static double cosAngleBetweenVectors(MyVector vector, MyVector otherVector) {
        double cosVectors = dotProductOfVectors(vector, otherVector) / vectorLength(vector) * vectorLength(otherVector);
        return cosVectors;
    }

    static double dotProductOfVectors(MyVector vector, MyVector otherVector) {
        double dotProduct = vector.coordinateX * otherVector.coordinateX + vector.coordinateY * otherVector.coordinateY +
                vector.coordinateZ * otherVector.coordinateZ;
        return dotProduct;
    }

    static MyVector addOfVectors(MyVector vector, MyVector otherVector) {
        MyVector addOfVectors = new MyVector((vector.coordinateX + otherVector.coordinateX), (vector.coordinateY + otherVector.coordinateY), (vector.coordinateZ + otherVector.coordinateZ));
        return addOfVectors;
    }

    static MyVector subOfVectors(MyVector vector, MyVector otherVector) {
        MyVector subOfVectors = new MyVector((vector.coordinateX - otherVector.coordinateX), (vector.coordinateY - otherVector.coordinateY), (vector.coordinateZ - otherVector.coordinateZ));
        return subOfVectors;
    }

    static MyVector[] arrayVector(int n) {
        MyVector[] vector = new MyVector[n];
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new MyVector(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
        }
        return vector;
    }
}


