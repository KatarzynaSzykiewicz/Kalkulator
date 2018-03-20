package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

public interface OrderService {
    boolean process(Supplier supplier, String product, int quantity);
}
