package com.bikeshop.payment;

@Test
void shouldAuthorizePayment() {
    PaymentService payment = new PaymentService();
    boolean result = payment.authorize("card123", 200.0);
    assertTrue(result);
}