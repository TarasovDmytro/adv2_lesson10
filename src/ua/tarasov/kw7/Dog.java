package ua.tarasov.kw7;

public class Dog extends Animal {
    protected String name;
    protected String voice;

    public Dog(String animal, String name, String food, String location, String voice) {
        super(animal, food, location);
        this.name = name;
        this.voice = voice;
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
