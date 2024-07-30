package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который заменяет значение num1 на квадратный (положительный) корень из этого числа до тех пор,
 * пока значение num1 остается больше единицы на величину, превышающую значение num2 (то есть кв. корень из num1 > 1 + num2).
 * Вывести в консоль все промежуточные значения и количество операций по извлечению квадратного корня из num1
 * в виде "Промежуточные: x1 x2 ... xN, Количество: y".
 * <p>
 * Например, для входящих значений 9 и 1.6 вывод будет:
 * Промежуточные: 3.0, Количество: 1
 */
public class Task145 {
    public static void loop(int num1, double num2) {
        double current = num1;
        int counter = 0;
        var joiner = new StringJoiner(" ");
        while (current > num2 + 1) {
            current = Math.sqrt(current);
            if (current < num2 + 1) {
                break;
            }
            joiner.add(String.format("%.1f", current));
            counter++;
        }
        System.out.printf("Промежуточные: %s, Количество: %d\n", joiner, counter);
    }
}
