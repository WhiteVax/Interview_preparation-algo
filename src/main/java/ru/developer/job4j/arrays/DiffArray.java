package ru.developer.job4j.arrays;

import java.util.Arrays;

/**
 * Разность множеств это операция при которой в результирующее множество попадают элементы из первого множества, но только если их нет во втором множестве.
 * Ваша задача реализовать эту операцию в коде. Множества заданы в виде массивов
 * Например,
 * {1}, {2} => {1}
 * {1}, {1} => {}
 * {1, 2}, {2} => {1}
 * {1}, {} => {1}
 */
public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length];
        int count = 0;
        for (int j : left) {
            boolean find = false;
            for (int k : right) {
                if (k == j) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                result[count++] = j;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
