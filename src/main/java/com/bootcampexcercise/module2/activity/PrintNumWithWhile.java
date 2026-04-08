package com.bootcampexcercise.module2.activity;

/**
 * Class Name: PrintNumWithWhile
 *
 * Description:
 * This class prints all odd numbers less than 100
 * using a while loop.
 */
public class PrintNumWithWhile {

    /**
     * Main method - entry point of the program
     * Calls the method to print odd numbers
     */
    public static void main(String[] args) {

        // Calling method to print odd numbers
        printOddNumbers();
    }

    /**
     * Method Name: printOddNumbers
     *
     * Description:
     * This method uses a while loop to print all odd numbers
     * less than 100.
     */
    public static void printOddNumbers() {

        // Variable to start from the first odd number
        int number = 1;

        // Loop runs while number is less than 100
        while (number < 100) {

            // Print current odd number
            System.out.println(number);

            // Increment by 2 to get next odd number
            number += 2;
        }
    }
}