package ru.developer.job4j.condition;

/**
 * Написать код, который высчитывает количество четных цифр во входящем двузначном числе, и выводит результат в консоль.
 * Переменная counter - это счетчик наших четных цифр.
 */
public class Task32_2 {
    public static void evenAmount(int number) {
        int num1, num2, counter = 0;
        num1 = number / 10;
        counter = num1 % 2 == 0 ? counter + 1 : counter;
        num2 = number % 10;
        counter = num2 % 2 == 0 ? counter + 1 : counter;
        System.out.println(counter);
    }
}
