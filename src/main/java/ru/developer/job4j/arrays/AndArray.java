package ru.developer.job4j.arrays;

import java.util.Arrays;

/**
 * Множество - это набор уникальных элементов. Пересечение множеств - это такая операция, когда в результирующее
 * множество попадают только элементы, которые есть в обоих множествах. Если нет такие элементов, то результат пустое множество.
 * Ваша задача реализовать данную операцию в коде. Множества заданы массивами
 * Например,
 * {1, 2} и {3, 4} => {}, нет общих элементов
 * {1, 2} и {1, 3, 4} => {1}, 1 общий элемент
 * {1, 2} и {1, 2, 3, 4} => {1, 2}, 1 и 2 общие элементы
 */
public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int count = 0;
        int[] result = new int[left.length];
        for (int k : left) {
            for (int i : right) {
                if (k == i) {
                    result[count++] = k;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
}
