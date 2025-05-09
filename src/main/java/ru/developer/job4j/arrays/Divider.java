package ru.developer.job4j.arrays;

/**
 * Метод принимает два параметра:
 * 1. Целочисленное значение num;
 * 2. Массив целочисленных значений ints.
 * Необходимо проверить являются ли все элементы массива ints, делителями числа num, если являются - то метод должен вернуть true.
 */
public class Divider {
    public static boolean check(int num, int[] ints) {
        boolean result = true;
        for (int anInt : ints) {
            if (num % anInt != 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
