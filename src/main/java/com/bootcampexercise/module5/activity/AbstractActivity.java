package com.bootcampexercise.module5.activity;

/**
 * Class Name: AbstractActivity
 *
 * Description:
 * This class demonstrates abstraction using Shape,
 * Rectangle, and Circle classes.
 */
public class AbstractActivity {

    /**
     * Main method - entry point
     */
    public static void main(String[] args) {

        // Rectangle operations
        Rectangle rectangle = createRectangle();
        printRectangleDetails(rectangle);

        System.out.println("-----------------------------");

        // Circle operations
        Circle circle = createCircle();
        printCircleDetails(circle);
    }

    /**
     * Method to create Rectangle object
     */
    public static Rectangle createRectangle() {

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.setColor("Blue");

        return rectangle;
    }

    /**
     * Method to print Rectangle details
     */
    public static void printRectangleDetails(Rectangle rectangle) {

        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }

    /**
     * Method to create Circle object
     */
    public static Circle createCircle() {

        Circle circle = new Circle(7);
        circle.setColor("Red");

        return circle;
    }

    /**
     * Method to print Circle details
     */
    public static void printCircleDetails(Circle circle) {

        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}