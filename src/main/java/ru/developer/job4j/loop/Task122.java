package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Ниже представлен метод loop(int[] num), который принимает массив целых положительных чисел.
 * Задание: Написать код, который выводит в консоль через пробел числа этого массива до тех пор,
 * пока сумма цифр текущего числа не будет равна 5 (это число выводить не нужно).
 * Например, для входящих значений [11, 222, 36, 23, 10] вывод должен быть:
 * 11 222 36
 */
public class Task122 {
    public static void loop(int[] nums) {
        var joiner = new StringJoiner(" ");
        for (int num : nums) {
            if (getSum(num) == 5) {
                break;
            }
            joiner.add(String.valueOf(num));
        }
        System.out.println(joiner);
    }

    private static int getSum(int num) {
        int rsl = 0;
        while (num > 0) {
            rsl += num % 10;
            num /= 10;
        }
        return rsl;
    }
}
