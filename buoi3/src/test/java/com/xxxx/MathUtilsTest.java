package com.xxxx;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    // ===== ISSUE #2: INVALID & BOUNDARY =====

    @Test
    void testPerimeter() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.rectanglePerimeter(0,2));
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.rectanglePerimeter(-1,2));
    }

    @Test
    void testArea() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.rectangleArea(0,2));
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.rectangleArea(-1,2));
    }

    @Test
    void testQuadratic() {
        assertEquals("No solution", MathUtils.quadratic(0,0,1));
    }

    @Test
    void testDays() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.daysInMonth(0,2024));
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.daysInMonth(13,2024));
    }

    @Test
    void testPrime() {
        assertFalse(MathUtils.isPrime(1));
        assertFalse(MathUtils.isPrime(-5));
    }

    @Test
    void testAlternating() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.alternatingSum(0));
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.alternatingSum(-1));
    }

    @Test
    void testGCD() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.gcd(-1,5));
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.gcd(-5,-10));
    }

    @Test
    void testFactorial() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.factorialSum(0));
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.factorialSum(-1));
    }
}