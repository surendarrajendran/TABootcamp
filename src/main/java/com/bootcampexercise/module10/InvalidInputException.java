package com.bootcampexercise.module10;

// custom exception for invalid input
public class InvalidInputException extends Exception {

    public InvalidInputException(String message) {
        super(message);
    }
}