package ru.developer.job4j.type;

/**
 * Написать код, который обменивает левые цифры этих чисел между собой. Результат вывести в консоль построчно.
 * Например, для чисел 123 и 456 вывод должен быть:
 * 423
 * 156
 */
public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        System.out.println(number2 / 100 * 100 + number1 % 100);
        System.out.println(number1 / 100 * 100 + number2 % 100);
    }
}
