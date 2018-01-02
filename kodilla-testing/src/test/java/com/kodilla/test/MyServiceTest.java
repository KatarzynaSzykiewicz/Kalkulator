package com.kodilla.test;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void getAveragePrice() throws Exception {

        //given
        CompanyAService serviceA = mock(CompanyAService.class);
        CompanyBService serviceB = mock(CompanyBService.class);

        MyService myService = new MyService(serviceA, serviceB);

        when(serviceA.getValue()).thenReturn(1);
        when(serviceB.getValue()).thenReturn(5);

        //when
        double result = myService.getAveragePrice();

        //then
        assertTrue(result == 3);
    }

}