package org.example.product;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderListRepo {

    @Getter
    public class OrderRepo {

        private List<Order> orderList;

        public OrderRepo(List<Order> orderList) {
            this.orderList = orderList;
        }

        public OrderRepo() {
            this.orderList = new ArrayList<>();
        }

        public void addProduct(Order order) {
            orderList.add(order);
        }

        public void removeProduct(Order order) {
            orderList.remove(order);
        }

        public Optional<Order> findOrderById(int orderId) {
            return orderList.stream()
                    .filter(product -> product.id() == orderId)
                    .findFirst();
        }

        public void updateOrder(Order updatedOrder) {
            int index = orderList.indexOf(updatedOrder);
            if (index != -1) {
                orderList.set(index, updatedOrder);
                System.out.println("Bestellung aktualisiert: " + updatedOrder);
            } else {
                System.out.println("Order not found.");
            }
        }
    }
}
