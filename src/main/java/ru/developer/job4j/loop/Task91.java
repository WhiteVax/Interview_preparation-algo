package ru.developer.job4j.loop;

/**
 * Написать код, который проверяет, являются ли 3 входящих числа последовательными членами арифметической прогрессии.
 * Вывести в консоль "Нет", если не являются, или вывести 3 следующих числа этой прогрессии через пробел.
 */
public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        int step = n2 - n1;
        if (step == n3 - n2) {
            n1 = n3 + step;
            n2 = n1 + step;
            n3 = n2 +step;
            System.out.printf("%d %d %d\n", n1, n2, n3);
        } else {
            System.out.println("Нет");
        }
    }
}
