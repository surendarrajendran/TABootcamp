package com.bootcampexcercise.module2.activity;

public class AddWholeNum {
    public static void main(String[] args) {

        // Variable to store total sum of numbers
        int sum = 0;

        // Loop variable 'i' iterates from 50 to 100
        for (int i = 50; i <= 100; i++) {
            sum += i;   // Adding each number to sum
        }

        // Print the final result
        System.out.println("Sum from 50 to 100 is: " + sum);
    }
}
