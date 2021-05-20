package ua.tarasov.kw7;

public class Cat extends Animal {
    protected String voice;
    protected String name;

    protected Cat(String animal, String name, String food, String location, String voice) {
        super(animal, food, location);
        this.voice = voice;
        this.name = name;
    }

    @Override
    protected void makeNoise() {
        System.out.println("The " + animal + " " + name + " is sleeping");
    }

    @Override
    protected void eat() {
        System.out.println("The " + animal + " " + name + " is eating " + food);
    }
}
