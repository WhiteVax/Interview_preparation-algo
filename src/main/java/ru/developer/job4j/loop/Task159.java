package ru.developer.job4j.loop;

/**
 * Написать код, который находит и выводит в консоль натуральное число от 1 до 10000 с максимальной суммой делителей.
 */
public class Task159 {
    public static void loop() {
        int maxSum = 0;
        int index = 0;
        for (int i = 1; i < 10000; i++) {
            int temp = 1;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    temp += j;
                }
            }
            if (temp > maxSum) {
                maxSum = temp;
                index = i;
            }
        }
        System.out.println(index);
    }
}
