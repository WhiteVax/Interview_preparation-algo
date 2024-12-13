package ru.developer.leetcode.easy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 * <p>
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 * Example 1:
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 * <p>
 * Example 2:
 * Input: rowIndex = 0
 * Output: [1]
 * <p>
 * Example 3:
 * Input: rowIndex = 1
 * Output: [1,1]
 */
public class PascalsTriangle_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i <= rowIndex; i++) {
            result.add(1);
            //временная сложность O(n^2)
            for (int j = i - 1; j > 0; j--) {
                // обновляем записанную строку
                System.out.println("piz");
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }
        /**
         * или через формулу
         * list.add(1)
         * for(i= 1; i<=rowIndex)
         * var number list.get(i - 1) * (rowIndex - i + 1) / i;
         * list.add(number);
         */
        return result;
    }
}



