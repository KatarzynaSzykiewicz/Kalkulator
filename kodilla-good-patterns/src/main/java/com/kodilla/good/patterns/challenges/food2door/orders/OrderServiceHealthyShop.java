package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

public class OrderServiceHealthyShop implements OrderService {

    @Override
    public boolean process(Supplier supplier, int productQuantity) {
        return true;
    }
}
