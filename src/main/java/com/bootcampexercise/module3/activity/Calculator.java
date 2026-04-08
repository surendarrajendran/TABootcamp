package com.bootcampexercise.module3.activity;

/**
 * Class Name: Calculator
 *
 * Description:
 * This class performs basic arithmetic operations such as
 * addition, subtraction, multiplication, and division.
 */
public class Calculator {

    // Constant for calculator type
    public static final String CALC_TYPE_BASIC = "BASIC";

    // Variable to store calculator type
    private String calculatorType;

    /**
     * Constructor to initialize calculator type
     *
     * @param calculatorType type of calculator
     */
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    /**
     * Method to return calculator type
     *
     * @return calculator type
     */
    public String getCalculatorType() {
        return calculatorType;
    }

    /**
     * Method Name: add
     *
     * Description:
     * Adds two integers
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Method Name: subtract
     *
     * Description:
     * Subtracts second number from first
     */
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Method Name: multiply
     *
     * Description:
     * Multiplies all elements of an integer array
     */
    public int multiply(int[] numbersArray) {

        int result = 1;

        for (int number : numbersArray) {
            result *= number;
        }

        return result;
    }

    /**
     * Method Name: divide
     *
     * Description:
     * Divides first number by second number
     */
    public int divide(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }

        return num1 / num2;
    }
}