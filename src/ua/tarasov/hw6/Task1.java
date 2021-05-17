package ua.tarasov.hw6;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.number = 670001112;
        phone1.model = "Samsung A31";
        phone1.weight = 185.0;
        phone2.number = 671112223;
        phone2.model = "Nokia One";
        phone2.weight = 131.0;
        phone3.number = 662223334;
        phone3.model = "Iphon 12 pro";
        phone3.weight = 189.0;
        System.out.println("Model - " + phone1.model + ", Weight - " + phone1.weight + ", tel. num. - " + phone1.number + ";");
        System.out.println("Model - " + phone2.model + ", Weight - " + phone2.weight + ", tel. num. - " + phone2.number + ";");
        System.out.println("Model - " + phone3.model + ", Weight - " + phone3.weight + ", tel. num. - " + phone3.number + ";");
        Phone.receiveCall(phone1.model);
        System.out.println("Phone number - " + Phone.getNumber(phone1.number));
        Phone.receiveCall(phone2.model);
        System.out.println("Phone number - " + Phone.getNumber(phone2.number));
        Phone.receiveCall(phone3.model);
        System.out.println("Phone number - " + Phone.getNumber(phone3.number));
    }
}
