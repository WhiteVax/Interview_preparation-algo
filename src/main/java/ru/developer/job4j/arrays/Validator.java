package ru.developer.job4j.arrays;

/**
 * Метод принимает массив целочисленных значений, а также число value, которое мы будем искать в этом массиве. Метод должен посчитать количество одинаковых элементов которые совпадают с value, и если окажется что это число больше или равно половине длины входного массива - массив считается невалидным и метод должен вернуть false.
 * Размер массива задается четным числом, то есть при деление всегда будет целое число.
 */
public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        var rsl = true;
        for (int datum : data) {
            if (datum == value) {
                count++;
            }
            if (count >= data.length / 2) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
