package ua.tarasov.hw6;

public class Phone {
    int number;
    String model;
    double weight;

    static void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    static int getNumber(int number) {
        return number;
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){

    }
}
