package ru.developer.leetcode.easy.array;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/single-number/
 *
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 *
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 *
 * 0(n)
 */
public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
//        var rsl = 0;
//        for (int num : nums) {
//            // числа которые встречаются дважды обнуляются
//            rsl ^= num;
//        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        return set.iterator().next();
    }
}
