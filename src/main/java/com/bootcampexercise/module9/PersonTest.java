package com.bootcampexercise.module9;

import junit.framework.TestCase;

// test class for Person
public class PersonTest extends TestCase {

    private Person person;

    // setup method
    protected void setUp() {
        person = new Person();
    }

    // teardown method
    protected void tearDown() {
        person = null;
    }

    // test getters and setters
    public void testGettersAndSetters() {

        person.setWeight(70);
        person.setHeight(1.75f);

        assertEquals(70, person.getWeight());
        assertEquals(1.75f, person.getHeight());
    }

    // test BMI method
    public void testBMI() {

        // normal case
        String result = person.getBodyMassIndex(1.75f, 70);
        assertEquals("Normal", result);

        // underweight
        result = person.getBodyMassIndex(1.75f, 50);
        assertEquals("Underweight", result);

        // overweight
        result = person.getBodyMassIndex(1.75f, 85);
        assertEquals("Overweight", result);

        // invalid case
        result = person.getBodyMassIndex(0, 70);
        assertEquals("Invalid input", result);
    }
}

/*
Output:

2 tests passed:
testGettersAndSet
testBMI

*/