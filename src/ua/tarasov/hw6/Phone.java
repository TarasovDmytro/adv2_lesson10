package ua.tarasov.hw6;

public class Phone {
    int number;
    String model;
    double weight;
    void printParameterValues(){
        System.out.println("Model - " + model + ", Weight - " + weight + ", tel. num. - " + number + ";");
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    int getNumber() {
        return number;
    }

    Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }
}
