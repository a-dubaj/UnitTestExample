package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(5, 3);
        assertEquals(15, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(9, 3);
        assertEquals(3, result);
    }

    @Test
    public void testAdd2() {
        int result = calculator.add(3, 5);
        assertNotNull(calculator);
        assertNotEquals(11, result);
    }
}