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

        String result2 = add.getAdd();

        if (result.equals(7)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        String result3 = subtract.getSubtract();

        if (result.equals(3)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }


}
