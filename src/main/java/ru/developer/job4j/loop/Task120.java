package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 * Задание: Написать код, который выводит в консоль через пробел все числа, которые можно получить из этого числа
 * за счет "стирания" последней цифры.
 * Например, для числа 52435 вывод должен быть:
 * 5243 524 52 5 0
 */
public class Task120 {
    public static void loop(int num) {
        var joiner = new StringJoiner(" ");
        while (num > 0) {
            num /= 10;
            joiner.add(String.valueOf(num));
        }
        System.out.println(joiner);
    }
}
