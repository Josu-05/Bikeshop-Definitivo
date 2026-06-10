package com.bikeshop.integration;

import org.springframework.stereotype.Service;

@Service
public class CheckoutService {
    public boolean checkout(String itemId, int quantity, String cardId) {
        return true; // lógica mínima
    }
}
