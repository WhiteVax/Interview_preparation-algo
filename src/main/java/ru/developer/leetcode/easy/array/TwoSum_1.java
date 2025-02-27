package ru.developer.leetcode.easy.array;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        // можно через мапу, добавляем в мапу, от таргета - значение ища его в мапе
        // map -> map.put(all i value),
        // for () temp = target - nums[i]
        // if (map.get(i) != temp && map.contains(temp))
        // array[0] = i; array[1] = map.get(); если абстрактно
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return array;
    }
}
