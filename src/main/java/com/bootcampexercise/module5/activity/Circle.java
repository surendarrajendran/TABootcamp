package com.bootcampexercise.module5.activity;

/**
 * Class Name: Circle
 *
 * Description:
 * This class represents a Circle and implements
 * area and perimeter calculations.
 */
public class Circle extends Shape {

    // Variable to store radius
    private double radius;

    /**
     * Constructor to initialize radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Method to calculate area of circle
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Method to calculate perimeter of circle
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}