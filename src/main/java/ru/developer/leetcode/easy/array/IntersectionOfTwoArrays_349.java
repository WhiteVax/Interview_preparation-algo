package ru.developer.leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 *
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the
 * result must be unique and you may return the result in any order.
 *
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 *
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */
public class IntersectionOfTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> unique = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        for (int j : nums2) {
            if (set.contains(j)) {
                unique.add(j);
            }
        }
        int[] array = new int[unique.size()];
        var iterator = unique.iterator();
        for (int i = 0; i < unique.size(); i++) {
            array[i] = iterator.next();
        }
        return array;
    }
}
