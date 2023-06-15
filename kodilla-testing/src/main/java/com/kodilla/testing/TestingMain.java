package com.kodilla.testing;

import calculator.Calculator;
import user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        // Test pierwszy->
        System.out.println("Test - pierwszy SimpleUser test jednostkowy:");
        //

            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")) {
                System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }

        // Kolejny Test ->
        System.out.println("Test - drugi Calculator (pierwsza metoda addAToB) test jednostkowy:");
        //

            Calculator Calculator = new Calculator();

            double resultOne = Calculator.addAToB(8.4, 8.4);
            double resultTwo = Calculator.substractAFroB(8.4, 8.4);

        if (resultOne == 16.8) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (resultTwo == 0) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }

}