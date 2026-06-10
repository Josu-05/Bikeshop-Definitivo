package com.bikeshop.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentServiceTest {

    @Test
    void shouldAuthorizePayment() {
        PaymentService payment = new PaymentService();
        boolean result = payment.authorize("card123", 200.0);
        assertTrue(result);
    }
}
