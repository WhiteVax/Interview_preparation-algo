package ru.developer.job4j.loop;

/**
 * Написать код, который выводит в консоль сумму серии чисел, которая продолжается,
 * пока не будет встречено 2 последовательных одинаковых числа
 * Например
 * 15
 */
public class Task114 {
    public static void loop(int[] num) {
        int sum = 0;
        int prev = 0;
        for (int j : num) {
            if (prev == j) {
                break;
            }
            sum += j;
            prev = j;
        }
        System.out.println(sum);
    }
}
