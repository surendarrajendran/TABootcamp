package com.bootcampexercise.module2.activity;

/**
 * Class Name: FindInArray
 *
 * Description:
 * This class creates an array of 20 integers and finds
 * the largest number in the array.
 */
public class FindInArray {

    /**
     * Main method - entry point of the program
     * Calls the method to find the largest number in the array
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Array containing 20 integer values
        int[] numbersArray = {
                12, 45, 7, 89, 23, 67, 34, 90, 11, 56,
                78, 2, 99, 54, 31, 88, 76, 3, 65, 100
        };

        // Calling method to find largest number
        int largestNumber = findLargestNumber(numbersArray);

        // Print the result
        System.out.println("Largest number in the array is: " + largestNumber);
    }

    /**
     * Method Name: findLargestNumber
     *
     * Description:
     * This method takes an integer array as input and returns
     * the largest number present in the array.
     *
     * @param inputArray array of integers
     * @return largest number in the array
     */
    public static int findLargestNumber(int[] inputArray) {

        // Variable to store the largest value, initialized with first element
        int largestValue = inputArray[0];

        // Loop through the array starting from second element
        for (int index = 1; index < inputArray.length; index++) {

            // Compare current element with largestValue
            if (inputArray[index] > largestValue) {
                largestValue = inputArray[index];
            }
        }

        return largestValue;
    }
}