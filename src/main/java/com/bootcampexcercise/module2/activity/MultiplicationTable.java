package com.bootcampexcercise.module2.activity;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Calling method to print tables
        printMultiplicationTables();
    }

    public static void printMultiplicationTables() {

        // Outer loop for numbers from 11 to 20
        for (int tableNumber = 11; tableNumber <= 20; tableNumber++) {

            System.out.println("Multiplication Table for: " + tableNumber);

            // Inner loop for multiplication from 1 to 10
            for (int multiplier = 1; multiplier <= 10; multiplier++) {

                // Variable to store multiplication result
                int product = tableNumber * multiplier;

                System.out.println(tableNumber + " x " + multiplier + " = " + product);
            }

            // Print empty line for better readability between tables
            System.out.println();
        }
    }
}