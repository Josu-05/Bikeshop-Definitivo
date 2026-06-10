package com.bikeshop.integration;

import java.util.UUID;

public class OrderService {
    public Order createOrder(String itemId, int quantity) {
        String id = UUID.randomUUID().toString();
        return new Order(id, itemId, quantity);
    }
}
