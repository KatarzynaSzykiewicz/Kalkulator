package com.kodilla.good.patterns.challenges.shop;

import java.util.HashSet;

public class OrderRequest {
    public User user;
    public HashSet<Products> basket;

    public double basketValue = basket.stream()
            .map(s -> s.getPrice())
            .reduce(((s, s1) -> s + s1))
            .get();

    public OrderRequest(User user, HashSet<Products> basket) {
        this.user = user;
        this.basket = basket;
    }

    public User getUser() {
        return user;
    }

    public HashSet<Products> getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "basket=" + basket +
                '}';
    }
}


