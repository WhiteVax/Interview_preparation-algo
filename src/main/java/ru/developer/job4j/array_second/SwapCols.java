package ru.developer.job4j.array_second;

/**
 * Ваша задача переставить два столбца в квадратной матрице. src, dest это индексы столбцов
 */
public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data.length; i++) {
            int temp = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = temp;
        }
    }
}
