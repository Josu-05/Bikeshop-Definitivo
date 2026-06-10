import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartServiceTest {

    @Test
    void shouldCalculateTotalCorrectly() {
        CartService cart = new CartService();
        cart.addItem("bike123", 2, 500.0); // 2 bicis de $500
        double total = cart.calculateTotal();
        assertEquals(1000.0, total);
    }

    @Test
    void shouldApplyDiscount() {
        CartService cart = new CartService();
        cart.addItem("bike123", 1, 100.0);
        double total = cart.calculateTotalWithDiscount(0.1); // 10% descuento
        assertEquals(90.0, total);
    }
}
