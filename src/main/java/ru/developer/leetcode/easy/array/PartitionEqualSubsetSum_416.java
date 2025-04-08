package ru.developer.leetcode.easy.array;

/**
 * Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the
 * elements in both subsets is equal or false otherwise.
 * <p>
 * Example 1:
 * Input: nums = [1,5,11,5]
 * Output: true
 * Explanation: The array can be partitioned as [1, 5, 5] and [11].
 * <p>
 * Example 2:
 * Input: nums = [1,2,3,5]
 * Output: false
 * Explanation: The array cannot be partitioned into equal sum subsets.
 */
public class PartitionEqualSubsetSum_416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (var i : nums) {
            sum += i;
        }

        if (sum % 2 != 0) {
            return false;
        }

        sum /= 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for (int i = 0; i < nums.length; i++) {
            for (int j = sum; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[sum];
    }
}
