package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Задание: Написать код, который выводит в консоль через пробел последующие за этим числом числа,
 * пока сумма этих чисел не превышает квадрата введенного числа.
 * Например, для входящего числа 5 вывод должен быть:
 * 6 7 8
 */
public class Task111 {
    public static void loop(int num) {
        int size = num * num;
        num++;
        int sum = 0;
        var joiner = new StringJoiner(" ");
        while (sum + num < size) {
            joiner.add(String.valueOf(num));
            sum += num;
            num++;
        }
        System.out.println(joiner);
    }
}
