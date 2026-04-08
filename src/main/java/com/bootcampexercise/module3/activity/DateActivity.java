package com.bootcampexercise.module3.activity;

import java.util.Date;

/**
 * Class Name: DateActivity
 *
 * Description:
 * This class creates an instance of Date and prints today's date
 */
public class DateActivity {

    /**
     * Main method - entry point of the program
     * Calls the method to display current date
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Calling method to print today's date
        printCurrentDate();
    }

    /**
     * Method Name: printCurrentDate
     *
     * Description:
     * This method creates a Date object and prints the current date.
     */
    public static void printCurrentDate() {

        // Creating Date object to store current date
        Date currentDate = new Date();

        // Printing today's date
        System.out.println("Today's Date: " + currentDate);
    }
}
