package com.company;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class NameDateTime {

    public static void main(String[] args) {
        String name = "Dmytro Tarasov";
        String currentDateTime = ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME);
	System.out.println(name);
	System.out.println(currentDateTime);
    }
}