package com.kodilla.good.patterns.challenges.shop.orders;

import com.kodilla.good.patterns.challenges.shop.users.InformationService;

public class ProductOrderServiceProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public ProductOrderServiceProcessor(final InformationService informationService, final OrderRepository orderRepository, final OrderService orderService) {
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
