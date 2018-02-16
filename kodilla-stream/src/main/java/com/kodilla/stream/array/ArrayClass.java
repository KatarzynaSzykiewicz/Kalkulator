package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayClass implements ArrayOperations{

List<Integer> numbers = new ArrayList<>();

    @Override
    public double getAverage() {
        int listOfNumbers = IntStream.range(0, numbers.size())
                .forEach(x -> System.out.println(x));
        double avarageNumber = IntStream.range(0, numbers.size())
                .average();

        return avarageNumber;
    }
}
