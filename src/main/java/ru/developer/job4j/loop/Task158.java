package ru.developer.job4j.loop;

/**
 * Написать код, который проверяет, можно ли представить входящее число в виде суммы квадратов 2 целых чисел.
 * Вывести в консоль "Да", если можно, или "Нет", если нет. Например, число 25 является таким числом (3*3 + 4*4).
 */
public class Task158 {
    public static void loop(int num) {
        int size = (int) Math.sqrt(num);
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i * i + j * j == num) {
                    System.out.println("Да");
                    return;
                }
            }
        }
        System.out.println("Нет");
    }
}
