package ru.developer.job4j.loop;

/**
 * Написать код который выводит число с наименьшей суммой цыфрв.
 */
public class Task103 {
    public static void loop(int[] num) {
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (sum(min) > sum(num[i])) {
                min = num[i];
            }
        }
        System.out.println(min);
    }

    private  static int sum(int num) {
        return num / 100 + num / 10 % 10 + num % 10;
    }
}
