package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;
    int add;
    int subtract;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;

        this.add = a + b;
        this.subtract = a - b;
    }

    public int getAdd() {
        return add;
    }

    public int getSubtract() {
        return subtract;
    }


}
