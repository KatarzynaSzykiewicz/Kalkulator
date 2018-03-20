package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

public class OrderRequest {
    public Supplier supplier;
    public int quantity;

    public OrderRequest(Supplier supplier, int quantity) {
        this.supplier = supplier;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getQuantity() {
        return quantity;
    }
}
