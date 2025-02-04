package ru.developer.leetcode.easy.array;

/**
 * https://leetcode.com/problems/maximum-ascending-subarray-sum/description/?envType=daily-question&envId=2025-02-04
 *
 * Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
 * A subarray is defined as a contiguous sequence of numbers in an array.
 * A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1.
 * Note that a subarray of size 1 is ascending.
 *
 * Example 1:
 * Input: nums = [10,20,30,5,10,50]
 * Output: 65
 * Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
 *
 * Example 2:
 * Input: nums = [10,20,30,40,50]
 * Output: 150
 * Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
 *
 * Example 3:
 * Input: nums = [12,17,15,13,10,11,12]
 * Output: 33
 * Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
 */
public class MaximumAscendingSubarraySum_1800 {
    public int maxAscendingSum(int[] nums) {
        // оптимизация jvm памяти прыгает часто в тестах LeetCoda
        int rsl = 0;
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (nums[i-1] < nums[i]) {
                temp+= nums[i];
            } else {
                temp = nums[i];
            }
            rsl = Math.max(temp, rsl);
//            if (rsl < temp) {
//                rsl = temp;
//            }
//          тоже самое оптимизацию по памяти сильно увеличивает Math.max()
        }
        return rsl;
    }
}
