package ru.developer.leetcode.easy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * <p>
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 */
public class PascalsTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        var lists = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            var list = new ArrayList<Integer>(i + 1);
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
            }
            if (i > 0) {
                list.add(1);
            }
            lists.add(list);
        }
        return lists;
    }
}
