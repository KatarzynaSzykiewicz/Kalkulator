package com.kodilla.good.patterns.challenges.food2door2.order;

public class OrderServiceProcessor {
    final OrderService orderService;

    public OrderServiceProcessor(final OrderService orderService) {
        this.orderService = orderService;
    }

    public String orderProcessor() {
        return orderService.process();
    }
}
