package ru.developer.job4j.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Написать код, который выводит в консоль через пробел все значения массива, начиная с первой ячейки.
 */
public class Task68 {
    public static void array(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        var joiner = new StringJoiner(" ");
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (countMap.get(num) == 1) {
                joiner.add(String.valueOf(num));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        array(arr);
    }
}
