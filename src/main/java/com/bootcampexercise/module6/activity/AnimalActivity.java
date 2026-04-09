package com.bootcampexercise.module6.activity;

/**
 * Class Name: AnimalActivity
 *
 * Description:
 * This class demonstrates usage of interface and polymorphism.
 */
public class AnimalActivity {

    public static void main(String[] args) {

        // Using interface reference
        Animal cat = new Cat();
        Animal dog = new Dog();

        // Create Mammal object
        Mammal mammal = new Mammal("Buddy");

        // Set animal to Cat
        mammal.setAnimal(cat);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();

        // Set animal to Dog
        mammal.setAnimal(dog);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
    }
}

/**
 * Output:
 * Animal with name: Buddy is ...
 * Cat is sleeping!
 * Animal with name: Buddy is ...
 * Cat says: 'Meow Meow'!
 * Animal with name: Buddy is ...
 * Dog is sleeping!
 * Animal with name: Buddy is ...
 * Dog says: 'Woof Woof'!
 *
 */