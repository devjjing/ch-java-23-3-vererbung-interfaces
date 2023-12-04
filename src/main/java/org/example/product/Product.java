package org.example.product;

public record Product(
        String name,
        String brand,
        String description,
        boolean availability,
        int price,
        int id,
        int warranty
) {
}