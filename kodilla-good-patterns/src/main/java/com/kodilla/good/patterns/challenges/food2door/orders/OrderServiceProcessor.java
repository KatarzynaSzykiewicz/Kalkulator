package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

public class OrderServiceProcessor implements OrderService {

    @Override
    public boolean process(Supplier supplier, int productQuantity) {
        extraFoodShop();
        GlutenFreeShop();

        return true;
    }

    private void GlutenFreeShop() {
    }

    private void extraFoodShop() {
        System.out.println("Implementation for Extra Food Schop.");
    }
}
