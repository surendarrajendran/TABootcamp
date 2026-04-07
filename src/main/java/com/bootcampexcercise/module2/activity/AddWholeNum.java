package com.bootcampexcercise.module2.activity;

public class AddWholeNum {
    public static void main(String[] args) {

        int sum = 0;

        // Add numbers from 50 to 100 using for loop
        for (int i = 50; i <= 100; i++) {
            sum += i;
        }

        // Print the result
        System.out.println("Sum from 50 to 100 is: " + sum);
    }
}
