package ru.developer.job4j.loop;

/**
 *  Написать код, который определяет, является ли входящее число точным квадратом целого числа. Вывести в
 * консоль "Да", если является, или "Нет", если не является.
 */
public class Task136 {
    public static void loop(int num) {
        boolean rsl = Math.sqrt(num) % 1 == 0;
        if (rsl) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
