package ru.developer.job4j.array;

/**
 * Если последовательность элементов удовлетворяет условию Ak <= Ak+1 <= ... <= Ak+m она называется неубывающей.
 * Длина последовательности это количество элементов, которые в нее входят.  В массиве таких последовательностей
 * может быть несколько, вам нужно найти длину максимальной из них.
 */
public class MaxLengthSeria {
    public static int find(int[] array) {
        if (array == null || array.length == 1) {
            return 1;
        }
        int count = 1;
        int temp = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] <= array[i]) {
                temp++;
                if (temp > count) {
                    count = temp;
                }
            } else {
                temp = 1;
            }

        }
        return count;
    }
}
