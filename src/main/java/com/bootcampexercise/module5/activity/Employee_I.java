package com.bootcampexercise.module5.activity;

/**
 * Class Name: Employee_I
 *
 * Description:
 * This class extends Person_I and adds employee-specific attributes
 * such as title and salary.
 */
public class Employee_I extends Person_I {

    // Variable to store employee title
    private String title;

    // Variable to store employee salary
    private double salary;

    /**
     * Method to set employee title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Method to get employee title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method to set employee salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Method to get employee salary
     */
    public double getSalary() {
        return salary;
    }
}