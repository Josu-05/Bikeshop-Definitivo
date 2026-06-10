package com.bikeshop.cart;

import java.util.UUID;

public class OrderService {

    public Order createOrder(String itemId, int quantity) {
        // Genera un ID aleatorio y devuelve un Order
        String id = UUID.randomUUID().toString();
        return new Order(id, itemId, quantity);
    }
}
