package com.bootcampexercise.module2.activity;

public class FindLargest {

    public static void main(String args[]) {

        int x = 10;
        int y = 88;
        int z = 2;
        int large;

        if (x >= y && x >=z) {          // check if x is larger than y and z
            large = x;
        } else if (y >= x && y>=z) {    // check if y is larger than x and z
            large = y;
        } else {
            large = z;                  // assign z as largest if x and y are not the largest
        }

        // Print result
        System.out.println("Largest Number is: " + large);
    }
}
