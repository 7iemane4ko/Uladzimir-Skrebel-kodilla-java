package com.kodilla.testing;

import calculator.Calculator;
import user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        // test pierwszy->
        System.out.println("Test - pierwszy SimpleUser test jednostkowy:");
        //

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // kolejny test ->
        System.out.println("Test - drugi Calculator (pierwsza metoda addAToB) test jednostkowy:");
        //

        Calculator Calculator = new Calculator();

        double resultOne = Calculator.addAToB(8.4, 8.4);

        System.out.println(result);

        // kolejny test ->
        System.out.println("Test - drugi Calculator (druga metoda addAToB) test jednostkowy:");
        //

        Calculator simpleCalculator = new Calculator();

        double resultTwo = simpleCalculator.substractAFroB(8.4, 8.4);

        System.out.println(result);

    }
}