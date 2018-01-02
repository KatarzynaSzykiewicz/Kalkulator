package com.kodilla.testing.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void getAdd() throws Exception {

        //given
        int a = 5;
        int b = -3;
        Calculator calculator = new Calculator(a, b);

        //when
        int res = calculator.getAdd();

        //then
        assertTrue(res == 2);
    }

    @Test
    public void getSubtract() throws Exception {

        //given
        int a = 5;
        int b = -3;
        Calculator calculator = new Calculator(a, b);

        //when
        int res = calculator.getSubtract();

        //then
        assertTrue(res == 8);

    }

}