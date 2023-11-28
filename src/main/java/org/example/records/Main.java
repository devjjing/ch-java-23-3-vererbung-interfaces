package org.example.records;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        destination home;
        home = new destination("Olten", new BigDecimal("0.2"), "Switzerland");

        String country = home.country();

        System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.2")));
        System.out.println(country);
    }
}