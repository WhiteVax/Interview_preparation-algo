package ru.developer.leetcode.easy.array.convert_sorted_to_binary_search_tree_108;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a
 * height-balanced
 * binary search tree.
 * <p>
 * Example 1:
 * Input: nums = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
 * <p>
 * Example 2:
 * Input: nums = [1,3]
 * Output: [3,1]
 * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 */
public class ConvertSortedToBinarySearchTree_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        // 0(n) Memory (long n)
        if (left > right) {
            return null;
        }

        int midIndex = left + (right - left) / 2;
        var root = new TreeNode(nums[midIndex]);
        // от минимального до середины идём
        root.left = helper(nums, left, midIndex - 1);
        // от середины до максимального
        root.right = helper(nums, midIndex + 1, right);
        return root;
    }
}


