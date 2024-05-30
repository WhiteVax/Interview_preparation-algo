package ru.developer.job4j.condition;

/**
 * Написать код, который высчитывает количество четных цифр во входящем трехзначном числе, и выводит результат в консоль.
 * Переменная counter - это счетчик наших четных цифр.
 */
public class Task33_2 {
    public static void evenAmount(int number) {
        int num1, num2, num3,  counter = 0;
        num1 = number / 100;
        counter = num1 % 2 == 0 ? counter + 1 : counter;
        num2 = number % 10;
        counter = num2 % 2 == 0 ? counter + 1 : counter;
        num3 = number / 10 % 10;
        counter = num3 % 2 == 0 ? counter + 1 : counter;
        System.out.println(counter);
    }
}
