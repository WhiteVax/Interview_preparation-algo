package ru.developer.job4j.loop;

/**
 * Написать код, который находит и выводит в консоль число с максимальной суммой цифр.
 */
public class Task100 {
    public static void loop(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            int temp = num[i] / 10 + num[i] % 10;
            if ((max / 10 + max % 10) < temp) {
                max = num[i];
            }
        }
        System.out.println(max);
    }
}
