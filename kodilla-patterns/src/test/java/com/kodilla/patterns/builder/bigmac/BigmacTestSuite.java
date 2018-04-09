package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(1)
                .roll("sesame roll")
                .sauce("barbecue sauce")
                .ingredient("salad")
                .ingredient("cucumber")
                .ingredient("chili")
                .ingredient("mushrooms")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(5, howManyIngredients);
    }
}
