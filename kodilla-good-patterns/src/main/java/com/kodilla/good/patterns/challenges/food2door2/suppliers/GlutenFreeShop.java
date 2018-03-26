package com.kodilla.good.patterns.challenges.food2door2.suppliers;

import com.kodilla.good.patterns.challenges.food2door2.order.OrderService;

public class GlutenFreeShop implements OrderService {
    @Override
    public String process() {
        return "Implementation for Gluten Free Shop.";
    }
}
