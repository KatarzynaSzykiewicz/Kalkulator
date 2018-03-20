package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private Supplier supplier;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final Supplier supplier) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.supplier = supplier;
    }

    public OrderDto order(final OrderRequest orderRequest) {
        boolean isOrdered = supplier.process();

        if(isOrdered) {
            informationService.inform(orderRequest.getProducts());
            return  new OrderDto(orderRequest.getProducts(), true);
        }else{
            return new OrderDto(orderRequest.getProducts(), false);
        }
    }
}
