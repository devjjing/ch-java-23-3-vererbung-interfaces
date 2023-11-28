package org.example.lombok;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class UniversityService {
    private final String name;
    private final int id;
}
