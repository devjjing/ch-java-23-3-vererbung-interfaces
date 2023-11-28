package org.example.lombok;

import java.math.BigDecimal;

public record Zoo(
        String name,
        int year,
        int id,
        String location
) {
}
