package ru.developer.job4j.array_second;

import java.util.Arrays;

/**
 * Назовем аномалиями диапазоны индексов, на которых значения массива меньше или равно down или больше или равно up.
 * Ваша задача найти все аномалии в массиве. Если в аномалии одно, число то нужно вернуть диапазон [i, i] - где i индекс числа выходящего за границы.
 * Например,
 * {5, 10, 15}, up = 16, down = 4 => аномалий нет
 * {5, 4, 15}, up = 16, down = 4 => {{1, 1}}
 * {5, 4, 3, 15}, up = 16, down = 4 => {{1, 2}}
 * {5, 10, 15, 1, 2}, up = 16, down = 4 => {{3, 4}}
 */
public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int count = 0;
        boolean inRange = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                if (!inRange) {
                    result[count][0] = i;
                    inRange = true;
                }
                result[count][1] = i;
            } else if (inRange) {
                count++;
                inRange = false;
            }
        }

        if (inRange) {
            count++;
        }
        return count == 0 ? new int[0][] : Arrays.copyOf(result, count);
    }
}
