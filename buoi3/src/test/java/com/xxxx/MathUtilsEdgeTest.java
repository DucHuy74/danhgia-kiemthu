package com.xxxx;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsEdgeTest {

    @Test
    void rectangle_invalid() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.rectanglePerimeter(-1,2));
    }

    @Test
    void quadratic_allBranches() {
        assertEquals("No solution", MathUtils.quadratic(0,0,1)); // a=0,b=0
        assertEquals("x=2.0", MathUtils.quadratic(0,2,-4));      // bậc 1
        assertEquals("No solution", MathUtils.quadratic(1,0,1)); // delta < 0
        assertEquals("x=1.0", MathUtils.quadratic(1,-2,1));      // delta = 0
        assertTrue(MathUtils.quadratic(1,0,-1).contains("x1=")); // delta > 0
    }

    @Test
    void days_invalid() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.daysInMonth(13,2024));
        assertEquals(28, MathUtils.daysInMonth(2,2023)); // không nhuận
    }

    @Test
    void prime_edge() {
        assertFalse(MathUtils.isPrime(1));
        assertFalse(MathUtils.isPrime(0));
        assertFalse(MathUtils.isPrime(-5));
    }

    @Test
    void alternating_invalid() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.alternatingSum(0));
    }

    @Test
    void gcd_edge() {
        assertEquals(5, MathUtils.gcd(5,0)); // dừng ngay
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.gcd(-1,5));
    }

    @Test
    void factorial_invalid() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.factorialSum(0));
    }
}