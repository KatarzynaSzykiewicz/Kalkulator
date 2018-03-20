package com.kodilla.good.patterns.challenges.food2door.orders;

public class OrderServiceGlutenFreeShop implements OrderService {

    @Override
    public boolean process() {

        return false;
    }

    String option1;

    public OrderServiceGlutenFreeShop(String option1) {
        this.option1 = option1;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }
}
