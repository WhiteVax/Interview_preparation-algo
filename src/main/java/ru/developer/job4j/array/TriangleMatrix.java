package ru.developer.job4j.array;

/**
 * Треугольная матрица, это матрица вида:
 * 1
 * 2 3
 * 4 5 6
 */
public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int counter = 1;
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = counter++;
            }
        }
        return triangle;
    }
}