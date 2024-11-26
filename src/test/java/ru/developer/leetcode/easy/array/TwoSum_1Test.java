package ru.developer.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum_1Test {
    @Test
    void whenThreeAndFiveTargetEightThenResultZeroAndOne() {
        TwoSum_1 twoSum = new TwoSum_1();
        int[] nums = {3, 7, 5, 15};
        int[] expected = {0, 2};
        int target = 8;
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }
}