package com.bootcampexercise.module5.activity;

/**
 * Class Name: Shape
 *
 * Description:
 * This abstract class represents a Shape with a color
 * and defines abstract methods for area and perimeter.
 */
public abstract class Shape {

    // Variable to store shape color
    protected String color;

    /**
     * Default constructor
     */
    public Shape() {
    }

    /**
     * Abstract method to calculate area
     *
     * @return area of shape
     */
    public abstract double calculateArea();

    /**
     * Abstract method to calculate perimeter
     *
     * @return perimeter of shape
     */
    public abstract double calculatePerimeter();

    /**
     * Method to set color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Method to get color
     */
    public String getColor() {
        return color;
    }
}