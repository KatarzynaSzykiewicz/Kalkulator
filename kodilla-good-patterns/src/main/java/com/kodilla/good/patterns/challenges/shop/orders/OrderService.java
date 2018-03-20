package com.kodilla.good.patterns.challenges.shop.orders;

import com.kodilla.good.patterns.challenges.shop.products.Products;
import com.kodilla.good.patterns.challenges.shop.users.User;

import java.util.HashSet;

public interface OrderService {
    boolean createOrder(User user, HashSet<Products> orderRequest);
}
