package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Ниже представлен метод loop(int[] num), который принимает массив целых положительных чисел.
 * Задание: Написать код, который считает и выводит в консоль через пробел сумму цифр каждого числа этого массива.
 * Например, для входящих значений [20, 321, 452, 58, 5] вывод должен быть:
 * 2 6 11 13 5
 */
public class Task121 {
    public static void loop(int[] nums) {
        var joiner = new StringJoiner(" ");
        for (int num : nums) {
            joiner.add(String.valueOf(getSum(num)));
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
}
