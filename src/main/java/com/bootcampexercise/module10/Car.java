package com.bootcampexercise.module10;

// Car class implementing Vehicle
public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}