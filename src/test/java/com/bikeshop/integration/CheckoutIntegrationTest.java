package com.bikeshop.integration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CheckoutIntegrationTest {

    @Autowired
    private CheckoutService checkoutService;

    @Test
    void shouldCompleteCheckoutSuccessfully() {
        boolean result = checkoutService.checkout("bike123", 1, "card123");
        assertTrue(result);
    }
}
