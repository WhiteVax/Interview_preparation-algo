package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 * Задание: Написать код, который заменяет это число на сумму его цифр до тех пор, пока не получится однозначное число.
 * Вывести в консоль через пробел все получившиеся числа.
 * Например, для числа 545 вывод должен быть:
 * 14 5
 */
public class Task123 {

    public static void loop(int num) {
        var joiner = new StringJoiner(" ");
        while (num >= 10) {
            num = getSum(num);
            joiner.add(String.valueOf(num));
        }
        System.out.println(joiner);
    }

    private static int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        loop(545);
    }
}
