package com.kodilla.spring.calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double addResult = calculator.add(3.0, 5.0);
        System.out.println(addResult);


    }
}
