@SpringBootTest
class CheckoutIntegrationTest {
    @Autowired
    private CheckoutService checkoutService;

    @Test
    void shouldCompleteCheckoutSuccessfully() {
        boolean result = checkoutService.checkout("bike123", 1, "card123");
        assertTrue(result);
    }
}
