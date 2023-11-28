package org.example.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Playground {
    public static void main(String[] args) {
        String[] pets = new String[4];
        pets[0] = "Anna";
        pets[1] = "Thomas";
        pets[2] = "Ben";
        pets[3] = "Noodles";

        // ----------------

        List<String> petsList = new ArrayList<>();

        petsList.add("Anna");
        petsList.add("Thomas");
        petsList.add("Ben");
        petsList.add("Noodles");

        petsList.remove("Noodles");
        String pet = petsList.get(0);

        Set<String> petSet = new HashSet<>();
        petSet.add("Mike");


        System.out.println("Array:");
        for (String p : pets) {
            System.out.println(p);
        }

        System.out.println("List:");
        for (String p : petsList) {
            System.out.println(p);
        }

        System.out.println("Set:");
        for (String p : petSet) {
            System.out.println(p);
        }
    }
}
