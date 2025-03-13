package ru.developer.job4j.array_second;

/**
 * Ваша задача объединить строки в один массив
 */
public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] array = new int[data.length * data[0].length];
        int count = 0;
        for (int[] datum : data) {
            for (int j = 0; j < data[0].length; j++) {
                array[count++] = datum[j];
            }
        }
        return array;
    }
}
