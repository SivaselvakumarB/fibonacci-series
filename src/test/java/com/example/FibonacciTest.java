package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFibonacciSeries() {
        long[] expected = {0, 1, 1, 2, 3, 5, 8};
        long[] actual = Fibonacci.generateSeries(7);

        assertArrayEquals(expected, actual);
    }

    @Test
    void testSingleTerm() {
        long[] expected = {0};
        long[] actual = Fibonacci.generateSeries(1);

        assertArrayEquals(expected, actual);
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class,
                () -> Fibonacci.generateSeries(0));
    }
}
