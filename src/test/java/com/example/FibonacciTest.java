package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFibonacciSeries() {
        long[] expected = {0, 1, 1, 2, 3, 5, 8};
        assertArrayEquals(expected, Fibonacci.generate(7));
    }

    @Test
    void testSingleTerm() {
        assertArrayEquals(new long[]{0}, Fibonacci.generate(1));
    }

    @Test
    void testZeroTerms() {
        assertArrayEquals(new long[]{}, Fibonacci.generate(0));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class,
                () -> Fibonacci.generate(-1));
    }
}
