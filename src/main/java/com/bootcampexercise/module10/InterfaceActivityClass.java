package com.bootcampexercise.module10;

// main class
public class InterfaceActivityClass {

    public static void main(String[] args) {

        // bike object
        Bike bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println("------------------");

        // car object
        Car car = new Car();
        car.start();
        car.stop();
    }
}

/*

Output:

Bike is starting
Bike is stopping
------------------
Car is starting
Car is stopping

*/