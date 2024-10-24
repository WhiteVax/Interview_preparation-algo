package ru.developer.job4j.array;

/**
 * Вам необходимо реализовать метод, который принимает массив целочисленных значений, сравнивает между собой первый
 * и последний элемент и возвращает максимальное из двух значений.
 */
public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        return array[0] > array[array.length - 1] ? array[0] : array[array.length - 1];
    }
}
