package ru.developer.job4j.type;

/**
 * Написать код, который обменивает правые цифры этих чисел между собой. Результат вывести в консоль построчно.
 * Например, для чисел 123 и 456 вывод должен быть:
 * 126
 * 453
 */
public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        System.out.println(number1 / 10 * 10 + number2 % 10);
        System.out.println(number2 / 10 * 10 + number1 % 10);
    }
}
