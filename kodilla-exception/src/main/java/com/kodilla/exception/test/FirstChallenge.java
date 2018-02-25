package com.kodilla.exception.test;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try (double result = firstChallenge.divide(3, 0)) {
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Sth went wrong: " + e);
        } finally {
            System.out.println("Finally.");
        }
    }
}
