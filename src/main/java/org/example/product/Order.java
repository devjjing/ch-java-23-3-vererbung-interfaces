package org.example.product;

public record Order(
        String name,
        String surname,
        String company,
        String address,
        String city,
        String state,
        String zipCode,
        String country,
        String brand,
        String description,
        String status,
        int orderDate,
        int dispatchDate,
        int paymentMethod,
        int estimatedArriveTime,
        int id,
        int tax,
        int shippingCost,
        int totalPrice
) {
}

