package com.bootcampexcercise.module2.activity;

/**
 * Class Name: Calculator
 *
 * Description:
 * This class performs basic arithmetic operations such as
 * addition, subtraction, multiplication, division, and modulus
 * using separate methods.
 */
public class Calculator {

    /**
     * Main method - entry point of the program
     * Calls all arithmetic methods with sample inputs
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        int firstNumber = 20;
        int secondNumber = 5;

        // Calling all methods
        sum(firstNumber, secondNumber);
        subtract(firstNumber, secondNumber);
        multiply(firstNumber, secondNumber);
        divide(firstNumber, secondNumber);
        modulus(firstNumber, secondNumber);
    }

    /**
     * Method Name: sum
     *
     * Description:
     * This method calculates and prints the sum of two numbers.
     *
     * @param num1 first integer
     * @param num2 second integer
     */
    public static void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Sum: " + result);
    }

    /**
     * Method Name: subtract
     *
     * Description:
     * This method calculates and prints the difference of two numbers.
     *
     * @param num1 first integer
     * @param num2 second integer
     */
    public static void subtract(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Subtraction: " + result);
    }

    /**
     * Method Name: multiply
     *
     * Description:
     * This method calculates and prints the product of two numbers.
     *
     * @param num1 first integer
     * @param num2 second integer
     */
    public static void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Multiplication: " + result);
    }

    /**
     * Method Name: divide
     *
     * Description:
     * This method calculates and prints the division of two numbers.
     * Handles division by zero.
     *
     * @param num1 first integer
     * @param num2 second integer
     */
    public static void divide(int num1, int num2) {
        if (num2 != 0) {
            int result = num1 / num2;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    /**
     * Method Name: modulus
     *
     * Description:
     * This method calculates and prints the remainder of two numbers.
     *
     * @param num1 first integer
     * @param num2 second integer
     */
    public static void modulus(int num1, int num2) {
        int result = num1 % num2;
        System.out.println("Modulus: " + result);
    }
}