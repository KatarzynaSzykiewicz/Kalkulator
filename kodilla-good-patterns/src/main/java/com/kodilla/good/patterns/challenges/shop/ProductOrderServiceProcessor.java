package com.kodilla.good.patterns.challenges.shop;

public class ProductOrderServiceProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public ProductOrderServiceProcessor() {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.createOrder(orderRequest.getUser(), orderRequest.getBasket());


        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getBasket());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
