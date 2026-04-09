package com.bootcampexercise.module7;

/**
 * Class Name: CustomExceptionActivityTest
 *
 * Description:
 * This class validates a user against a list of valid users
 * and throws a custom exception if the user is invalid.
 */
public class CustomExceptionActivityTest {

    /**
     * Main method - entry point of the program
     * Calls validateUser with different inputs
     */
    public static void main(String[] args) {

        CustomExceptionActivityTest test = new CustomExceptionActivityTest();

        // Testing with valid user
        test.callValidateUser("John");

        // Testing with invalid user
        test.callValidateUser("Alex");
    }

    /**
     * Wrapper method to handle exception
     */
    public void callValidateUser(String name) {

        try {
            validateUser(name);
        } catch (CustomExceptionActivity exception) {
            System.out.println(exception.getMessage());
        }
    }

    /**
     * Method Name: validateUser
     *
     * Description:
     * Checks if the given user exists in the validUsers array.
     * Throws custom exception if not found.
     *
     * @param name user name
     * @throws CustomExceptionActivity if user is invalid
     */
    void validateUser(String name) throws CustomExceptionActivity {

        // Array of valid users
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        // Flag to check if user exists
        int flag = 0;

        for (int index = 0; index < validUsers.length; index++) {

            // Check if name matches any valid user
            if (validUsers[index].equals(name)) {
                flag = 1;
                break;
            }
        }

        // If user not found → throw exception
        if (flag == 0) {
            throw new CustomExceptionActivity();
        } else {
            // If user found
            System.out.println("Welcome to Payroll program");
        }
    }
}

/**

Output:
Welcome to Payroll program
You are not allowed to use this program

 */