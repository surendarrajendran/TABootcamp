package com.bootcampexercise.module3.activity;

/**
 * Class Name: CarInstance
 *
 * Description:
 * This class creates an instance of Car and prints
 * its attributes.
 */
public class CarInstance {

    /**
     * Main method - entry point of the program
     * Calls methods to print car details
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Creating Car object
        Car carObject = createCar();

        // Printing only car name
        printCarName(carObject);

        // Printing all car attributes
        printCarDetails(carObject);
    }

    /**
     * Method Name: createCar
     *
     * Description:
     * This method creates and returns a Car object with sample values.
     *
     * @return Car object with initialized values
     */
    public static Car createCar() {

        Car car = new Car();

        car.carName = "Toyota";
        car.carColor = "Red";
        car.modelNumber = 2022;

        return car;
    }

    /**
     * Method Name: printCarName
     *
     * Description:
     * This method prints only the car name.
     *
     * @param car Car object
     */
    public static void printCarName(Car car) {
        System.out.println("Car Name: " + car.carName);
    }

    /**
     * Method Name: printCarDetails
     *
     * Description:
     * This method prints all attributes of the car.
     *
     * @param car Car object
     */
    public static void printCarDetails(Car car) {

        System.out.println("Car Name: " + car.carName);
        System.out.println("Car Color: " + car.carColor);
        System.out.println("Model Number: " + car.modelNumber);
    }
}