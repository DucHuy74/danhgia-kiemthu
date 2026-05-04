package com.xxxx;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsValidTest {

    @Test
    void rectangle_valid() {
        assertEquals(10, MathUtils.rectanglePerimeter(2,3));
        assertEquals(6, MathUtils.rectangleArea(2,3));
    }

    @Test
    void quadratic_valid() {
        assertEquals("x=2.0", MathUtils.quadratic(0,1,-2)); // bậc 1
        assertEquals("x=1.0", MathUtils.quadratic(1,-2,1)); // delta=0

        String res = MathUtils.quadratic(1,0,-1); // delta > 0
        assertTrue(res.contains("x1="));
    }

    @Test
    void days_valid() {
        assertEquals(31, MathUtils.daysInMonth(1,2024));
        assertEquals(30, MathUtils.daysInMonth(4,2024));
        assertEquals(29, MathUtils.daysInMonth(2,2024));
    }

    @Test
    void prime_valid() {
        assertTrue(MathUtils.isPrime(7));
        assertFalse(MathUtils.isPrime(8));
    }

    @Test
    void alternating_valid() {
        assertEquals(2, MathUtils.alternatingSum(3));
    }

    @Test
    void gcd_valid() {
        assertEquals(2, MathUtils.gcd(6,4));
    }

    @Test
    void factorial_valid() {
        assertEquals(9, MathUtils.factorialSum(3));
    }
}