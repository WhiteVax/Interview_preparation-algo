package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит числа в консоль через пробел, пока количество четных чисел на нечетных местах
 * в выведенной серии остается меньше 3 (третье четное число на нечетном месте не выводится).
 */
public class Task132 {
    public static void loop(int[] nums) {
        int evenNumbers = 0;
        var joiner = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 && nums[i] % 2 == 0) {
                evenNumbers += 1;
            }
            if (evenNumbers == 3) {
                break;
            }
            joiner.add(String.valueOf(nums[i]));
        }
        System.out.println(joiner);
    }
}
