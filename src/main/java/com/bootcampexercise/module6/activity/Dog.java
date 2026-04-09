package com.bootcampexercise.module6.activity;

/**
 * Class Name: Dog
 *
 * Description:
 * This class implements Animal interface for Dog behavior.
 */
public class Dog implements Animal {

    /**
     * Implementation of animalSound method
     */
    @Override
    public void animalSound() {
        System.out.println("Dog says: 'Woof Woof'!");
    }

    /**
     * Implementation of sleep method
     */
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }
}