package ru.developer.job4j.array_second;

/**
 * Метод принимает массив целочисленных значений. Необходимо реализовать метод, который превратит одномерный массив
 * в квадратный двумерный. Напомню, что квадратный двумерный массив - это массив, в котором число рядов и элементов
 * в каждом ряду одинаково. При этом если элементов в исходном массиве не хватает, чтобы заполнить весь двумерный
 * массив - необходимо заполнить его 0.
 */
public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = 1;
        while (size * size < array.length) {
            size++;
        }
        int[][] rsl = new int[size][size];
        int count = 0;
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[0].length; j++) {
                rsl[i][j] = count < array.length ? array[count++] : 0;
            }
        }
        return rsl;
    }
}
