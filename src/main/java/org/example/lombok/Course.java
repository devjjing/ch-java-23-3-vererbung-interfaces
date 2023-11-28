package org.example.lombok;

import lombok.Data;

@Data

public class Course {
    int id;
    String subject;
    int amountStudents;
    int credits;
}
