package ru.developer.job4j.loop;

/**
 * Написать код, который определяет наименьшее двузначное число, сумма цифр которого равна num.
 * Например, для числа 9 вывод должен быть:
 * 18
 */
public class Task137 {
    public static void loop(int num) {
        for (int i = 10; i < 100; i++) {
            if (i % 10 + i / 10 == num) {
                System.out.println(i);
                break;
            }
        }
    }
}
