package ru.developer.job4j.array_second;

/**
 * Вам дана квадратная матрица. Нужно получить правую диагональ. Правая диагональ это диагональ матрицы,
 * которая идет справа налево. Например, для {{1, 2}, {3, 4}} это будет {2, 3}, левой в этом случае будет {1, 4}
 */
public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] rsl = new int[data[0].length];
        int count = 0;
        for (int i = data[0].length - 1; i >= 0; i--) {
            rsl[count] = data[count++][i];
        }
        return rsl;
    }
}
