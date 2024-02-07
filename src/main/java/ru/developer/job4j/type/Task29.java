package ru.developer.job4j.type;

/**
 * Задание: Написать код, который высчитывает сумму цифр данного числа, и выводит результат в консоль.
 * Например, для числа 325 вывод должен быть:
 * 10
 */
public class Task29 {
    public static void numSum(int number) {
        int first, second, third;
        first = number / 100;
        second = number / 10 % 10;
        third = number % 10;
        System.out.println(first + second + third);
    }
}
