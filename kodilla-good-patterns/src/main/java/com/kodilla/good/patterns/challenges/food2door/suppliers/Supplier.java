package com.kodilla.good.patterns.challenges.food2door.suppliers;

import com.kodilla.good.patterns.challenges.food2door.orders.OrderService;

import java.util.HashSet;
import java.util.Objects;

public class Supplier implements OrderService{
    String supplierName;
    HashSet<String> products;
    int productAvailability;

    public Supplier(final String companyName, final HashSet<String> products, final int productAvailability) {
        this. supplierName = supplierName;
        this.products = products;
        this.productAvailability = productAvailability;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public HashSet<String> getProducts() {
        return products;
    }

    public int getProductAvailability() {
        return productAvailability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Supplier)) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(supplierName, supplier.supplierName) &&
                Objects.equals(products, supplier.products);
    }

    @Override
    public int hashCode() {

        return Objects.hash(supplierName, products);
    }


    @Override
    public boolean process(Supplier supplier, String product, int quantity) {
        return false;
    }
}


