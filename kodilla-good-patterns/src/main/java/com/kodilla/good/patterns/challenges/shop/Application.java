package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.shop.orders.*;
import com.kodilla.good.patterns.challenges.shop.users.InformationServiceProcessor;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();


        ProductOrderServiceProcessor productOrderServiceProcessor = new ProductOrderServiceProcessor(new InformationServiceProcessor(), new OrderRepositoryProcessor(), new OrderServiceProcessor());
        productOrderServiceProcessor.process(orderRequest);
        System.out.println(orderRequest);

    }

}
