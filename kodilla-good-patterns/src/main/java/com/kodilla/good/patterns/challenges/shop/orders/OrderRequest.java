package com.kodilla.good.patterns.challenges.shop.orders;

import com.kodilla.good.patterns.challenges.shop.products.Products;
import com.kodilla.good.patterns.challenges.shop.users.User;

import java.util.HashSet;

public class OrderRequest {
    public User user;
    public HashSet<Products> basket;

    public double basketValue = basket.stream()
            .map(s -> s.getPrice())
            .reduce(((s, s1) -> s + s1))
            .get();

    public User getUser() {
        return user;
    }

    public HashSet<Products> getBasket() {
        return basket;
    }

    public double getBasketValue() {
        return basketValue;
    }

    public OrderRequest(User user, HashSet<Products> basket, double basketValue) {
        this.user = user;
        this.basket = basket;
        this.basketValue = basketValue;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", basket=" + basket +
                ", basketValue=" + basketValue +
                '}';
    }
}


