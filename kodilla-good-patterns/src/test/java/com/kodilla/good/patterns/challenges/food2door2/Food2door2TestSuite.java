package com.kodilla.good.patterns.challenges.food2door2;

import com.kodilla.good.patterns.challenges.food2door2.order.OrderServiceProcessor;
import com.kodilla.good.patterns.challenges.food2door2.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door2.suppliers.HealthyShop;
import org.junit.Assert;
import org.junit.Test;

public class Food2door2TestSuite {
    @Test
    public void testOrderProcessorForHealthyShop() {
        //Given
        HealthyShop healthyShop = new HealthyShop();
        //When
        OrderServiceProcessor orderServiceProcessor = new OrderServiceProcessor(healthyShop);
        String result = orderServiceProcessor.orderProcessor();
        //Then
        Assert.assertEquals("Implementation for Healthy Shop.", result);
    }

    @Test
    public void testOrderProcessorForGlutenFreeShop() {
        //Given
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        //When
        OrderServiceProcessor orderServiceProcessor = new OrderServiceProcessor(glutenFreeShop);
        String result = orderServiceProcessor.orderProcessor();
        //Then
        Assert.assertEquals("Implementation for Gluten Free Shop.", result);
    }
}
