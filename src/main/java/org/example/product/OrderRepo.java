package org.example.product;

import java.util.List;
import java.util.Optional;

public interface OrderRepo {
    void addProduct(Order order);

    void removeProduct(Order order);

    Optional<Order> findOrderById(int orderId);

    void updateOrder(Order updatedOrder);

    List<Order> getOrderList();
}


