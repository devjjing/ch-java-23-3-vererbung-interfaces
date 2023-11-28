package org.example.lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
    private int id;
    private String name;
    private String surname;
    private int year;
    private String group;
}
