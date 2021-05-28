package ua.tarasov.kw7;

import java.util.Arrays;

public class KlassWork {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", "food", "bed");
        Dog dog = new Dog("dog", "Fram", "bone", "booth", "gav");
        Cat cat = new Cat("cat", "Murchik", "milk", "kitchen", "mau");
        Horse horse = new Horse("horse", "Gnedoy", "oats", "stable", "igogo");

        animal.makeNoise();
        animal.eat();
        animal.sleep();

        dog.makeNoise();
        dog.eat();
        dog.sleep();

        cat.makeNoise();
        cat.eat();
        cat.sleep();

        horse.makeNoise();
        horse.eat();
        horse.sleep();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("dog", "bone", "booth");
        animals[1] = new Animal("cat", "milk", "kitchen");
        animals[2] = new Animal("horse", "oats", "stable");

        Arrays.stream(animals).forEach(Vet::treatAnimal);
    }
}
