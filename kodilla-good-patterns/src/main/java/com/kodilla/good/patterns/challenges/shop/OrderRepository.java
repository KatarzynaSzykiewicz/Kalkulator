package com.kodilla.good.patterns.challenges.shop;

import java.util.HashSet;

public interface OrderRepository {
    boolean createOrder(User user, HashSet<Products> orderRequest);
}
