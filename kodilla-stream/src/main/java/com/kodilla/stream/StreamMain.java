package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");


        SaySomething saySomething = new SaySomething();
        saySomething.say();


        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        //zad. 7.1

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(("Ula ma kota.", "@") -> System.out.println("@" + "Ula ma kota." + "@"));
        poemBeautifier.beautify("Pada śnieg.", ("***") -> System.out.println("***" + "Pada śnieg"));
        poemBeautifier.beautify("Zbliza sie wiosna.", text.toUpperText())???

    }

}
