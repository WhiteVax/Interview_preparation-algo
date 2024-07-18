package ru.developer.job4j.loop;

/**
 * Написать код, который выводит в консоль число с обратным порядком цифр входящего числа.
 */
public class Task135 {
    public static void loop(int num) {
        int rsl = 0;
        while (num > 0) {
            rsl = rsl * 10 + num % 10;
            num /= 10;
        }
        System.out.println(rsl);
    }
}
