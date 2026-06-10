package com.bikeshop.payment.cart;

public class PaymentService {

    public boolean authorize(String cardId, double amount) {
        // Lógica mínima: siempre autoriza
        return true;
    }

    public boolean process(String cardId, double amount) {
        // Lógica mínima: siempre procesa
        return true;
    }
}
