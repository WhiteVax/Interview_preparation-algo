package ru.developer.job4j.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Симметрическая разность - это такая операция, когда в результирующее множество попадают все элементы из обоих множеств,
 * кроме тех, которые есть и в том и в другом множествах.
 * Ваша задача реализовать эту операцию. Множества заданы в виде массивов.
 * Например,
 * {1}, {2} => {1, 2}
 * {1, 2}, {2, 3} => {1, 3}
 * {1}, {} => {1}
 */
public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        Set<Integer> unique = new HashSet<>();
        process(unique, left);
        process(unique, right);
        return unique.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void process(Set<Integer> set, int[] array) {
        for (int num : array) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
    }
}
