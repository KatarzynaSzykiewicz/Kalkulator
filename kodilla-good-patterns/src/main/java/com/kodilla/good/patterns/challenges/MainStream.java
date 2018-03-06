package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();

         String theResult = movieStore.getMovies().entrySet().stream()
                 .map(s -> s.getValue())
                 .collect(Collectors.joining("!"));

         System.out.println(theResult);

    }
}
