package ru.developer.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPosition_35Test {
    @Test
    void when1And2And3And4And5Target3Then2() {
        var search = new SearchInsertPosition_35();
        int target = 3;
        int[] array = {1, 2, 3, 4, 5};
        int expected = 2;
        assertEquals(expected, search.searchInsert(array, target));
    }

    @Test
    void when1And3And5And6Target2Then1() {
        var search = new SearchInsertPosition_35();
        int target = 2;
        int[] array = {1, 3, 5, 6};
        int expected = 1;
        assertEquals(expected, search.searchInsert(array, target));
    }
}