package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(5, 5, 2, 3, 1, 2,7, 8);

        // Stream erstellen und ungerade Zahlen filtern
        List<Integer> evenNumbers = numberList.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        // Stream erstellen und Zahlen verdoppeln
        List<Integer> doubledNumbers = numberList.stream()
                .map(number -> number * 2)
                .toList();

        // Stream erstellen und Zahlen aufsteigend sortieren
        List<Integer> ascendingNumbers = numberList.stream()
                .sorted()
                .toList();


        // Ergebnis ausgeben
        System.out.println("Normal:" + numberList);
        System.out.println("Gerade Zahlen: " + evenNumbers);
        System.out.println("Verdoppelte Zahlen: " + doubledNumbers);
        System.out.println("Zahlen aufsteigend sortiert: " + ascendingNumbers);
    }
}