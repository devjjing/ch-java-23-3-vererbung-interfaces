package org.example.lombok;

import java.math.BigDecimal;

public record Animal(
        String name,
        int age,
        BigDecimal weight,
        String species,
        String habitat) {
}
