package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.0, 1.5);
        } catch (Exception e) {
            throw new Exception();
        } finally {
            System.out.println("Finally!");
        }
    }
}
