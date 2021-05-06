package ua.tarasov.hw1;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {

    public static void main(String[] args) {
        String name = "Dmytro Tarasov";
        String currentDateTime = ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME);
        System.out.println(name);
        System.out.println(currentDateTime);
    }
}