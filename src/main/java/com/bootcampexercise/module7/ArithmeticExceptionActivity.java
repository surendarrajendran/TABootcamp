package com.bootcampexercise.module7;

/**
 * Class Name: ArithmeticExceptionActivity
 *
 * Description:
 * This class demonstrates handling of ArithmeticException
 * using try-catch-finally.
 */
public class ArithmeticExceptionActivity {

    /**
     * Main method - entry point of the program
     * Calls catchMe method with different inputs
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {

        // Creating object
        ArithmeticExceptionActivity activity = new ArithmeticExceptionActivity();

        // Call with division by zero (exception case)
        activity.catchMe(10, 0);

        // Call with valid division
        activity.catchMe(10, 2);
    }

    /**
     * Method Name: catchMe
     *
     * Description:
     * This method performs division and handles ArithmeticException.
     *
     * @param num1 numerator
     * @param num2 denominator
     */
    public void catchMe(int num1, int num2) {

        try {

            // Division operation (may cause exception)
            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException exception) {

            // Handling division by zero
            System.out.println("Exception caught: Cannot divide by zero!");

        } finally {

            // Always executed
            System.out.println("Thank you for using this program.");
        }
    }
}

/*

Output:
Exception caught: Cannot divide by zero!
Thank you for using this program.
Result: 5
Thank you for using this program.


*/