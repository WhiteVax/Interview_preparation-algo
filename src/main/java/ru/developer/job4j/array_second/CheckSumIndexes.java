package ru.developer.job4j.array_second;

import java.util.Arrays;

/**
 * Необходимо реализовать метод который вернет одномерный массив, который не будет содержать значений 0. При этом исходные данными будут следующими:
 * 1. Квадратный двумерный массив целочисленных значений data.
 * 2. Целочисленный элемент sum, который означает сумму индексов в массиве.
 * При этом необходимо чтобы выполнились следующие условия:
 * 1. Если сумма индексов при переборе двумерного массива равна sum, то элемент с такими индексами должен принять значение 0.
 * 2. Выходной одномерный массив не должен содержать значения 0.
 * Например, если массив состоит из элементов: {{1, 2}, {3, 4}}, а sum = 1, то элемент с индексом [1, 0] и [0, 1] нужно удалить. То есть это числа 2 и 3.
 */
public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] array = new int[data.length * data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (i + j != sum) {
                    array[count++] = data[i][j];
                }
            }
        }
        return Arrays.copyOf(array, count);
    }
}
