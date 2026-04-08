package com.bootcampexercise.module3.activity;

/**
 * @author Surendar Rajendran
 */
public class CalculatorClient {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
         *final variable defined in Calculator class.
         */
        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("*** Calculations will be performed using " + normalCalc.getCalculatorType() + " calculator ***");

        // Add
        int result = normalCalc.add(4, 5);
        System.out.println("1) Add result is " + result);


        // Multiply
        int[] numbersArray = {2, 3, 4};
        result = normalCalc.multiply(numbersArray);
        System.out.println("2) Multiplication result is " + result);


        //Division
        result = normalCalc.divide(10, 2);
        System.out.println("3) Divide result is " + result);


        //Subtraction
        result = normalCalc.subtract(10, 2);
        System.out.println("4) Subtract result is " + result);
    }


}
