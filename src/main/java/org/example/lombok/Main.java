package org.example.lombok;

import lombok.Getter;

@Getter

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        UniversityService universityService = main.getKitchen();

        System.out.println("Name: " + universityService.getName());
        System.out.println("ID-Nummer: " + universityService.getId());
    }

    UniversityService kitchen = UniversityService.builder()
            .name("Food")
            .id(8)
            .build();

    }

