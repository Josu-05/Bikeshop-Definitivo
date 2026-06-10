package com.bikeshop.integration;

public class Order {
    private String id;
    private String itemId;
    private int quantity;

    public Order(String id, String itemId, int quantity) {
        this.id = id;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public String getId() { return id; }
    public String getItemId() { return itemId; }
    public int getQuantity() { return quantity; }
}

