package ru.developer.job4j.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnionThreeArraysTest {
    @Test
    public void union() {
        int[] left = {1, 2, 3, 4, 5};
        int[] middle = {6, 7, 8, 9, 10};
        int[] right = {11, 12, 13, 14, 15, 16};
        int[] rsl = UnionThreeArrays.union(left, middle, right);
        int[] expected = {1, 11, 7, 13, 9, 15, 5};
        assertArrayEquals(rsl, expected);
    }

    @Test
    public void unionReturnArrayWith5Elements() {
        int[] left = {1, 2, 3};
        int[] middle = {4, 5, 6};
        int[] right = {7, 8, 9, 10};
        int[] rsl = UnionThreeArrays.union(left, middle, right);
        int[] expected = {1, 7, 5, 9, 3};
        assertArrayEquals(rsl, expected);
    }

}