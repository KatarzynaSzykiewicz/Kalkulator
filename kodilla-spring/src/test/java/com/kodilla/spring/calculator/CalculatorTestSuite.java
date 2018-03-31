package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        //When
        double addResult = calculator.add(3.0, 5.0);
        double subResult = calculator.sub(15.0, 3.0);
        double divResult = calculator.div(64.0, 8.0);
        double mulResult = calculator.mul(4.0, 8.0);
        //Then
        Assert.assertEquals(addResult, 8.0, 0.01);
        Assert.assertEquals(subResult, 12.0, 0.01);
        Assert.assertEquals(divResult, 8.0, 0.01);
        Assert.assertEquals(mulResult, 32.0, 0.01);
    }
}
