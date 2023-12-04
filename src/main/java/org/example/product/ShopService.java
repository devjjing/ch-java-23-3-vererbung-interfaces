package org.example.product;

import java.util.List;

public class ShopService {
    public static void main(String[] args) {
        OrderListRepo orderListRepo = new OrderListRepo();
        OrderListRepo.OrderRepo orderRepo = orderListRepo.new OrderRepo();

        List<Order> orderList = orderRepo.getOrderList();

        if (orderList.size() >= 1){
            System.out.println("Es konnten " + orderList.size() + "Bestellungen gefunden werden");
        }   else {
            System.out.println("Keine Bestellungen konnten gefunden werden");
        }
    }
}