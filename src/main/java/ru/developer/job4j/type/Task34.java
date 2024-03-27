package ru.developer.job4j.type;

/**
 * Задание: Написать код, который высчитывает количество четных цифр во входящем четырехзначном числе, и выводит результат в консоль.
 * Переменная counter - это счетчик наших четных цифр.
 * Например, для числа 4012 вывод должен быть:
 * 3
 */
public class Task34 {
    public static void evenAmount(int number) {
        int counter = 0;
        while (number < 0) {
            if (number % 10 % 2 == 0) {
                counter++;
            }
            number /= 10;
        }
        System.out.println(counter);
    }
}
