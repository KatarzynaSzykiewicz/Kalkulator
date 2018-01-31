package com.kodilla.stream;

//import com.kodilla.stream.lambda.Processor;

//import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressinExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

//import static com.sun.webkit.text.StringCase.toUpperCase;

//public class StreamMain {
//public static void main(String[] args) {
//    Processor processor = new Processor();
//    processor.execute(() -> System.out.println("This is an example text."));
//}

//public class StreamMain {
//    public static void main(String[] arg) {
//        ExpressinExecutor expressinExecutor = new ExpressinExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressinExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressinExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressinExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressinExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculation expressions with method references");
//        expressinExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressinExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressinExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressinExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//    }

//public class StreamMain {
//    public static void main (String[] arg) {
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify(toUpperCase());
//
//    }
//
public class StreamMain {
    public static void main(String[] args){
        System.out.println ("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}


