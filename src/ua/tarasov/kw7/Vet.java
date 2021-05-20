package ua.tarasov.kw7;

public class Vet {
    protected static void treatAnimal(Animal animal) {
        System.out.println("The " + animal.animal + " is eating " + animal.food + " in " + animal.location);
    }
}
