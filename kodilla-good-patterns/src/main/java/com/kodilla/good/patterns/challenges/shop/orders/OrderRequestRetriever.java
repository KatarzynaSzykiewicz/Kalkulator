package com.kodilla.good.patterns.challenges.shop.orders;

import com.kodilla.good.patterns.challenges.shop.products.Products;
import com.kodilla.good.patterns.challenges.shop.users.User;

import java.util.HashSet;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        User user = new User("John", "Black");
        Products product1 = new Products("TV", 1299.99);
        Products product2 = new Products("socks", 9.99);
        Products product3 = new Products("blanket", 69.99);


        HashSet<Products> basket = new HashSet<>();
        basket.add(product1);
        basket.add(product2);
        basket.add(product3);

        double value = basket.stream()
                .map(s -> s.getPrice())
                .reduce(((s, s1) -> s + s1))
                .get();

        return new OrderRequest(user, basket, value);
    }
}
