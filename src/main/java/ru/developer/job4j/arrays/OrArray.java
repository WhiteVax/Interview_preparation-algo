package ru.developer.job4j.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Объединение множеств это такая операция при которой в результирующее множество попадают элементы,
 * которые есть хотя бы в одном множестве.
 * Ваша задача реализовать эту операцию. Множества заданы в виде массива
 * Например,
 * {1}, {2} => {1, 2}
 * {1, 2}, {2} => {1, 2}
 * {1, 2}, {3} => {1, 2, 3}
 * {1}, {} => {1}
 */
public class OrArray {
    public static int[] or(int[] left, int[] right) {
        return IntStream.concat(Arrays.stream(left), Arrays.stream(right))
                .distinct()
                .toArray();
    }
}
