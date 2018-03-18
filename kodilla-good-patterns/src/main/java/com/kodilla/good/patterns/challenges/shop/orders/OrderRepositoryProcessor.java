package com.kodilla.good.patterns.challenges.shop.orders;

import com.kodilla.good.patterns.challenges.shop.products.Products;
import com.kodilla.good.patterns.challenges.shop.users.User;

import java.util.HashSet;

public class OrderRepositoryProcessor implements OrderRepository {
    @Override
    public boolean createOrder(User user, HashSet<Products> orderRequest) {
        SendToRepository();
        return true;
    }

    private void SendToRepository() {
        System.out.println("I'm sending to repository.");
    }
}
