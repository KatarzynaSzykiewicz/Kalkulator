package com.kodilla.good.patterns.challenges.food2door.suppliers;

import com.kodilla.good.patterns.challenges.food2door.orders.OrderService;

import java.time.LocalDate;
import java.util.HashSet;

public class GlutenFreeShopSupplier extends Supplier implements OrderService {

    private LocalDate expiryDate;

    public GlutenFreeShopSupplier(String companyName, HashSet<String> products, int productAvailability, LocalDate expiryDate) {
        super(companyName, products, productAvailability);
        this.expiryDate = expiryDate;
    }


}
