package ru.developer.job4j.array;

/**
 * Вам необходимо реализовать метод, который проверит является ли последовательность целочисленных значений,
 * которая находится во входящем массиве, последовательностью чисел Фибоначчи.
 * Метод должен вернуть true, если последовательность чисел - числа Фибоначчи.
 */
public class Fibonacci {
    public static boolean checkArray(int[] data) {
        for (int i = 0; i < data.length - 2; i++) {
            if (data[i] + data[i + 1] != data[i+2]) {
                return false;
            }
        }
        return true;
    }
}
