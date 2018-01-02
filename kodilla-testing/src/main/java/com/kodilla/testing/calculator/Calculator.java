package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;


    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    int add = a + b;
    int subtract = a - b;

    public int getAdd(){
        return add;
    }

    public int getSubtract(){
        return subtract;
    }


}
