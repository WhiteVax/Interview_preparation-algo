package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел в порядке возрастания все положительные трехзначные числа
 * до 153 (не включая), оканчивающиеся на 7. Перед началом вывода нужно вывести слово "Старт" в отдельной строке,
 * а после окончания вывода чисел - слово "Финиш", тоже в отдельной строке.
 */
public class Task19 {
    public static void loop() {
        var joiner = new StringJoiner(" ");
        for (int i = 100; i <= 153; i += 10) {
            joiner.add(String.valueOf(i));
        }
        System.out.printf("Старт\n%s\nФиниш\n", joiner);
    }
}
