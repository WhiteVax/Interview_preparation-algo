package ru.developer.leetcode.easy.array;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/majority-element
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority
 * element always exists in the array.
 *
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        // 0 (n)
        int rsl = 0;
        int size = nums.length / 2;
        var map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            int counter = map.getOrDefault(num, 1);
            if (counter > size) {
                return num;
            }
            map.put(num, counter + 1);
        }

//        int count = 0;
//        for (var number : nums) {
//            if (count == 0) {
//                rsl = number;
//            }
//            count += number == rsl ? 1 : -1;
//            System.out.printf("rsl = %d count = %d %n", rsl, count);
//            if (count > nums.length / 2) {
//                return number;
//            }
//        }
        return rsl;
    }
}
