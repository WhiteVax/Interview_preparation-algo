package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который находит и выводит в консоль через пробел все двузначные числа, у которых удвоенная сумма цифр
 * равна их произведению, а также выводит количество и сумму этих чисел.
 */
public class Task90 {
    public static void loop() {
        int counter = 0;
        int sum = 0;
        var joiner = new StringJoiner(" ");
        joiner.setEmptyValue("0");
        for (int i = 10; i < 100; i++) {
            if (((i % 10) * (i / 10)) == i / 10 * 2 + i % 10 * 2) {
                sum += i;
                counter++;
                joiner.add(String.valueOf(i));
            }
        }
        System.out.printf("Числа: %s, Количество: %d, Сумма: %d\n", joiner, counter, sum);
    } 
}
