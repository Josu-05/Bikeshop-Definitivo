package com.bikeshop.integration;

import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class OrderService {
    public Order createOrder(String itemId, int quantity) {
        String id = UUID.randomUUID().toString();
        return new Order(id, itemId, quantity);
    }
}
