package com.kodilla.good.patterns.challenges.shop;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderServiceProcessor productOrderServiceProcessor = new ProductOrderServiceProcessor();
        productOrderServiceProcessor.process(orderRequest);
    }
}
