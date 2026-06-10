package com.bikeshop.cart;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    private static class Item {
        String id;
        int qty;
        double price;
        Item(String id, int qty, double price) {
            this.id = id; this.qty = qty; this.price = price;
        }
    }

    private List<Item> items = new ArrayList<>();

    public void addItem(String id, int qty, double price) {
        items.add(new Item(id, qty, price));
    }

    public double calculateTotal() {
        return items.stream()
                    .mapToDouble(i -> i.qty * i.price)
                    .sum();
    }

    public double calculateTotalWithDiscount(double discount) {
        double total = calculateTotal();
        return total - (total * discount);
    }
}
