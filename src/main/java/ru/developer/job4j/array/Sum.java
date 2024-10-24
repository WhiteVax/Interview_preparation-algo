package ru.developer.job4j.array;

/**
 * Вам необходимо реализовать метод, который принимает массив целочисленных значений и возвращает сумму первого
 * и последнего элемента в этом массиве.
 */
public class Sum {
    public static int getSum(int[] array) {
        return array[0] + array[array.length - 1];
    }
}
