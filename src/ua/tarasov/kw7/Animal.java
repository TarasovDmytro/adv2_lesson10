package ua.tarasov.kw7;

public class Animal {
    protected String animal;
    protected String food;
    protected String location;


    public Animal(String animal, String food, String location) {
        this.animal = animal;
        this.food = food;
        this.location = location;
    }

    protected void makeNoise() {
        System.out.println("The " + animal + " is sleeping");
    }

    protected void eat() {
        System.out.println("The " + animal + " is eating " + food);
    }

    protected void sleep() {
        System.out.println("The " + animal + " is sleeping in the " + location);
    }

}
