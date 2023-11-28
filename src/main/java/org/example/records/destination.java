package org.example.records;

import java.math.BigDecimal;

public record destination(
        String name,
        BigDecimal price,
        String country
) {
}
