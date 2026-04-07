package com.bootcampexcercise.module2.activity;

public class NumToWords {

    public static void main(String[] args) {

        // Call the method
        switchCaseEx(5);   // Calling function with 5 as parameter
        switchCaseEx(100); // variation to execute default statement
        switchCaseEx(1);   // Calling function with 1 as parameter
    }

    public static void switchCaseEx(int number) {

        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("Given value is not in the range 1-10");
        }
    }
}
