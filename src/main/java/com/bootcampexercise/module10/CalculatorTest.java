package com.bootcampexercise.module10;

import junit.framework.TestCase;

// test class
public class CalculatorTest extends TestCase {

    private Calculator calc;

    protected void setUp() {
        calc = new Calculator();
    }

    protected void tearDown() {
        calc = null;
    }

    // ===== ADD TESTS (4 tests) =====

    public void testAddInt1() {
        assertEquals(5, calc.add(2, 3));
    }

    public void testAddInt2() {
        assertEquals(0, calc.add(-2, 2));
    }

    public void testAddDouble1() {
        assertEquals(5.5, calc.add(2.5, 3.0));
    }

    public void testAddDouble2() {
        assertEquals(0.0, calc.add(-2.5, 2.5));
    }

    // ===== SUBTRACT TESTS (2 tests) =====

    public void testSubtract1() {
        assertEquals(2, calc.subtract(5, 3));
    }

    public void testSubtract2() {
        assertEquals(-1, calc.subtract(2, 3));
    }

    // ===== DIVIDE TESTS (2 tests) =====

    public void testDivideValid() {
        assertEquals(5, calc.divide(10, 2));
    }

    public void testDivideByZero() {
        assertEquals(0, calc.divide(10, 0)); // exception handled
    }

    // ===== MULTIPLY TESTS (2 tests) =====

    public void testMultiplyValid() {
        assertEquals(20, calc.multiply(4, 5));
    }

    public void testMultiplyInvalid() {
        assertEquals(0, calc.multiply(-2, 5)); // exception case
    }
}

/*

Output:

10 tests passed

Invalid input for division
Negative numbers not allowed

 */