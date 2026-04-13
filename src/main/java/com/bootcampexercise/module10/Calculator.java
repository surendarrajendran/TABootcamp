package com.bootcampexercise.module10;

// calculator class
public class Calculator {

    // add method 1
    public int add(int a, int b) {
        return a + b;
    }

    // add method 2 (overloading)
    public double add(double a, double b) {
        return a + b;
    }

    // subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // divide method with try-catch
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid input for division");
            return 0;
        }
    }

    // multiply method with custom exception
    public int multiply(int a, int b) {
        try {
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Negative numbers not allowed");
            }
            return a * b;
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}