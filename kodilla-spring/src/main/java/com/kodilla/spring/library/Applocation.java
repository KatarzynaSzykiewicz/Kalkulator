package com.kodilla.spring.library;

import com.kodilla.spring.calculator.Calculator;
import com.kodilla.spring.calculator.Val;

public class Applocation {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Val val = new Val(3.0, 5.0);
        double addResult = calculator.add(3.0, 5.0);
    }
}
