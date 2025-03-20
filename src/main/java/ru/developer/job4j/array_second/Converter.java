package ru.developer.job4j.array_second;

/**
 * Метод принимает двумерный массив у которого число рядов и число элементов в ряду не совпадают, также количество
 * элементов в каждом ряду может быть абсолютно произвольным.
 * Вам необходимо реализовать метод так, чтобы на выходе получился двумерный квадратный массив. При этом размерность
 * выходного массива должна рассчитываться. Если для полного заполнения выходного массива в исходном массиве
 * не хватает элементов - необходимо дополнить массив 0.
 * <p>
 * Например:
 * Исходный массив {{1}, {2, 3, 4}} - должно получиться {{1, 2}, {3, 4}}
 * Исходный массив {{1}, {2, 3, 4}, {5, 6}} - должно получиться {{1, 2, 3}, {4, 5, 6}, {0, 0, 0}}
 */
public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            size += array[i].length;
        }

        int[] row = new int[size];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                row[count++] = array[i][j];
            }
        }

        int sizeQ = 1;
        while (sizeQ * sizeQ < size) {
            sizeQ++;
            System.out.println(sizeQ + "=" + (sizeQ * sizeQ) + "<=" + size);
        }

        int[][] nArray = new int[sizeQ][sizeQ];
        count = 0;

        for (int i = 0; i < sizeQ; i++) {
            for (int j = 0; j < sizeQ; j++) {
                nArray[i][j] = count < row.length ? row[count++] : 0;
            }
        }

        return nArray;
    }
}
