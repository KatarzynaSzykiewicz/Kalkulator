package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {


    static void getAverage(int[] numbers){
        Double  averageNumber = IntStream.range(0, numbers.length)
                .map(s -> {System.out.println("The elements are: " + s)})
                .average()
                .getAsDouble();
    }
    }
