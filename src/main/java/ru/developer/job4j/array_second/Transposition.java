package ru.developer.job4j.array_second;

/**
 * Транспонирование матрицы, это когда строки исходной матрицы, становятся столбцами в результирующей матрице
 */
public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
