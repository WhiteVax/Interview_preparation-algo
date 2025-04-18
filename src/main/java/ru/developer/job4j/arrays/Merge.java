package ru.developer.job4j.arrays;

/**
 * Даны два отсортированных по возрастанию массива.
 * Необходимо их соединить.
 */
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] array = new int[left.length + right.length];
        int l = 0, r = 0, i = 0;

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                array[i++] = left[l++];
            } else {
                array[i++] = right[r++];
            }
        }

        while (l < left.length) {
            array[i++] = left[l++];
        }

        while (r < right.length) {
            array[i++] = right[r++];
        }
        return array;
    }
}

