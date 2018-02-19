package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite implements ArrayOperations{
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {5,13,56,87,66,2,14,3,6,88,62,22,37,9,64,34,94,6,4,7};


        //When
       double result = numbers.getAverage();

        //Then
        Assert.assertEquals(33.95, result);
    }
}
