package ru.developer.job4j.array;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SummingPreviousTest {
    @Test
    public void test() {
        assertArrayEquals(new int[] {1, 2, 3}, SummingPrevious.calculate(1, 2, 3));
        assertArrayEquals(new int[] {1, 2, 3, 6}, SummingPrevious.calculate(1, 2, 4));
        assertArrayEquals(new int[] {1, 2, 3, 6, 12}, SummingPrevious.calculate(1, 2, 5));
    }
}