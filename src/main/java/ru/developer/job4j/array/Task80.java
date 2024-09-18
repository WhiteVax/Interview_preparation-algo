package ru.developer.job4j.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Метод array должен возвращать массив, который содержит номера ячеек входящего массива, в которых записаны значения,
 * встречающиеся в нем только один раз.
 */
public class Task80 {
    public static int[] array(int[] nums) {
        Map<Integer, Long> countMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return IntStream.range(0, nums.length)
                .filter(i -> countMap.get(nums[i]) == 1)
                .toArray();
    }
}
