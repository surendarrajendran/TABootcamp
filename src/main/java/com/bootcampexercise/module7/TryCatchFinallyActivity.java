package com.bootcampexercise.module7;

/**
 * Class Name: TryCatchFinallyActivity
 *
 * Description:
 * This class demonstrates exception handling using try, catch,
 * and finally blocks.
 */
public class TryCatchFinallyActivity {

    /**
     * Main method - entry point of the program
     * Calls the catchMeIfYouCan method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create object to call non-static method
        TryCatchFinallyActivity activity = new TryCatchFinallyActivity();

        // Calling method
        activity.catchMeIfYouCan();
    }

    /**
     * Method Name: catchMeIfYouCan
     *
     * Description:
     * This method intentionally causes an exception and handles it
     * using try-catch-finally.
     */
    public void catchMeIfYouCan() {

        // Array with 10 elements
        int[] numbersArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {

            // Loop with incorrect condition to trigger exception
            for (int index = 0; index <= 10; index++) {
                System.out.println("Value: " + numbersArray[index]);
            }

        } catch (IndexOutOfBoundsException exception) {

            // Custom error message
            System.out.println("Exception caught: Index is out of bounds!");

        } finally {

            // This block always executes
            System.out.println("Finally block executed.");
        }
    }
}

/*

Output:
Value: 0
Value: 1
Value: 2
Value: 3
Value: 4
Value: 5
Value: 6
Value: 7
Value: 8
Value: 9
Exception caught: Index is out of bounds!
Finally block executed.

 */