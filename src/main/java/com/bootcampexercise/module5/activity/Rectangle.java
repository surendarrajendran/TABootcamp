package com.bootcampexercise.module5.activity;

/**
 * Class Name: Rectangle
 *
 * Description:
 * This class represents a Rectangle and implements
 * area and perimeter calculations.
 */
public class Rectangle extends Shape {

    // Variables to store dimensions
    private double length;
    private double width;

    /**
     * Constructor to initialize rectangle dimensions
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Method to calculate area of rectangle
     */
    @Override
    public double calculateArea() {
        return length * width;
    }

    /**
     * Method to calculate perimeter of rectangle
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}