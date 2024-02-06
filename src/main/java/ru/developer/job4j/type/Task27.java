package ru.developer.job4j.type;

/**
 * Задание: Построить новое значение, составленное из цифр входящего числа, но в обратном порядке.
 * Полученное значение нужно уменьшить на 20 и вывести в консоль.
 * Например, для числа 327 нужно построить число 723, и вывести на экран 703.
 */
public class Task27 {
    public static void transform(int number) {
        int first, second, third;
        first = number % 10 * 100;
        second = number / 10 % 10 * 10;
        third = number / 100;
        System.out.println(first + second + third - 20);
    }
}
