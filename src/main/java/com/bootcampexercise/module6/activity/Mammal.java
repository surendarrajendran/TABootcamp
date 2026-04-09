package com.bootcampexercise.module6.activity;

/**
 * Class Name: Mammal
 *
 * Description:
 * This class uses Animal interface to demonstrate polymorphism.
 */
public class Mammal {

    // Variable to store Animal reference
    private Animal myAnimal;

    // Variable to store name of mammal
    private String name;

    /**
     * Constructor to initialize name
     */
    public Mammal(String name) {
        this.name = name;
    }

    /**
     * Method to set Animal type
     */
    public void setAnimal(Animal animal) {
        myAnimal = animal;
    }

    /**
     * Method to demonstrate sleep behavior
     */
    public void animalIsSleeping() {
        System.out.println("Animal with name: " + name + " is ...");
        myAnimal.sleep(); // calling interface method
    }

    /**
     * Method to demonstrate sound behavior
     */
    public void animalIsSpeaking() {
        System.out.println("Animal with name: " + name + " is ...");
        myAnimal.animalSound(); // calling interface method
    }
}