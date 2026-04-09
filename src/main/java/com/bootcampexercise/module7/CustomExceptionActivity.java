package com.bootcampexercise.module7;

/**
 * Class Name: CustomExceptionActivity
 *
 * Description:
 * This class defines a custom exception for invalid users.
 */
public class CustomExceptionActivity extends Exception {

    /**
     * Override getMessage to provide custom error message
     */
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}