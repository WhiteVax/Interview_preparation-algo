package ru.developer.job4j.loop;

/**
 * Написать код, который проверяет, является ли входящее число числом Фибоначчи. Вывести в консоль "Да", если является,
 * или "Нет", если не является.
 */
public class Task142 {
    public static void loop(int num) {
        int first = 0;
        if (first == num) {
            System.out.println("Да");
            return;
        }
        int second = 1;
        int next = first;
        while (next <= num) {
            if (num == second) {
                System.out.println("Да");
                return;
            }
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println("Нет");
    }
}
