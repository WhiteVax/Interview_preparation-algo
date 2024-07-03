package ru.developer.job4j.loop;

/**
 * Написать код, который выводит наибольшее и наименьшее, с тем учётом того, что могут отсутствовать значения.
 */
public class Task102 {
    public static void loop(int[] num) {
        int max = -1;
        int min = 0;
        for (int number : num) {
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
        }
        System.out.printf("Max: %s, min: %s\n", max == -1 ? "Нет" : max,
                min == 0 ? "Нет" : min);
    }
}
