package ua.tarasov.hw7;

import java.util.Arrays;
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

    public MyVector() {

    }


    public void vectorLength(MyVector vector) {
//        MyVector[] myVector = MyVector.arrayVector(1);
//        System.out.println("[ " + myVector[0].coordinateX + " ; " + myVector[0].coordinateY + " ; " + myVector[0].coordinateZ + " ]");
        double vecLenght = Math.sqrt(vector.coordinateX * vector.coordinateX + vector.coordinateY * vector.coordinateY +
                vector.coordinateZ * vector.coordinateZ);
        System.out.println("|{ " + vector.coordinateX + " ; " + vector.coordinateY + " ; " + vector.coordinateZ + " }| = " + vecLenght);
    }

    public void multiVector(MyVector vector, MyVector vector1) {
        MyVector multiVector = new MyVector((vector.coordinateY * vector1.coordinateZ - vector.coordinateZ * vector1.coordinateY),
                (vector.coordinateZ * vector1.coordinateX - vector.coordinateX * vector1.coordinateZ),
                (vector.coordinateX * vector1.coordinateY - vector.coordinateY * vector1.coordinateX));
        System.out.println("{ " + vector.coordinateX + " ; " + vector.coordinateY + " ; " + vector.coordinateZ + " } * { "
                + vector1.coordinateX + " ; " + vector1.coordinateY + " ; " + vector1.coordinateZ + " } = { "
                + multiVector.coordinateX + " ; " + multiVector.coordinateY + " ; " + multiVector.coordinateZ + " }");

    }



    public static MyVector[] arrayVector(int n) {
        MyVector[] vector = new MyVector[n];
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new MyVector(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
        }
        return vector;
    }

}


