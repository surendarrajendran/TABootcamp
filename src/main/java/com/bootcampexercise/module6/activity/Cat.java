package com.bootcampexercise.module6.activity;

/**
 * Class Name: Cat
 *
 * Description:
 * This class implements Animal interface for Cat behavior.
 */
public class Cat implements Animal {

    /**
     * Implementation of animalSound method
     */
    @Override
    public void animalSound() {
        System.out.println("Cat says: 'Meow Meow'!");
    }

    /**
     * Implementation of sleep method
     */
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }
}