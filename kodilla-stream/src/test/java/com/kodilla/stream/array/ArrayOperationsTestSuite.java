package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(13);
        numbers.add(56);
        numbers.add(87);
        numbers.add(66);
        numbers.add(2);
        numbers.add(14);
        numbers.add(3);
        numbers.add(6);
        numbers.add(88);
        numbers.add(62);
        numbers.add(22);
        numbers.add(37);
        numbers.add(9);
        numbers.add(64);
        numbers.add(34);
        numbers.add(94);
        numbers.add(6);
        numbers.add(4);
        numbers.add(7);

        //When
        double result = numbers.getAverage();


        //Then
        Assert.assertEquals(33.95, result);
    }
}
