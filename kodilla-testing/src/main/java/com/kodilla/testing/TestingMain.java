package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(5,2);

        int result2 = calculator.getAdd();

        if (result2 == 7) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int result3 = calculator.getSubtract();

        if (result3 == 3) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }


}