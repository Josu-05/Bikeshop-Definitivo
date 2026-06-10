package com.bikeshop.integration;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderIntegrationTest {

    @Autowired
    private OrderService orderService;

    @Test
    void shouldCreateOrderAndPersist() {
        Order order = orderService.createOrder("bike123", 2);
        assertNotNull(order.getId()); // se generó un ID
        assertEquals(2, order.getQuantity()); // cantidad correcta
    }
}