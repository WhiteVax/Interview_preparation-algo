package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Ниже представлен метод loop(int[] nums), который принимает массив целых положительных чисел.
 * Задание: Написать код, который выводит в консоль сумму цифр каждого элемента массива и индекс элемента с наибольшей суммой цифр.
 * Результат вывести в виде "Суммы: х1 х2 ... хN, индекс: y".
 * Например, для массива значений [4, 351, 250, 29, 93] вывод должен быть:
 * Суммы: 4 9 7 11 12, индекс: 4
 */
public class Task124 {
    public static void loop(int[] nums) {
        int max = getSum(nums[0]);
        int index = 0;
        var joiner = new StringJoiner(" ");
        joiner.add(String.valueOf(max));
        for (int i = 1; i < nums.length; i++) {
            int temp = getSum(nums[i]);
            if (max < temp) {
                max = temp;
                index = i;
            }
            joiner.add(String.valueOf(temp));
        }
        System.out.printf("Суммы: %s, индекс: %d\n", joiner, index);
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
