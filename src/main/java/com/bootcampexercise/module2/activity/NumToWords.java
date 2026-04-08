package com.bootcampexercise.module2.activity;

public class NumToWords {

    public static void main(String[] args) {

        // Calling method with valid input
        switchCaseEx(5);

        // Calling method with invalid input to trigger default case
        switchCaseEx(100);

        // Calling method with another valid input
        switchCaseEx(1);
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
