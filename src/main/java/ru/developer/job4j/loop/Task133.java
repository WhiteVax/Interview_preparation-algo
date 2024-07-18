package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который подсчитывает и выводит в консоль серию значений num, num^2, num^3 ... num^n до тех пор,
 * пока очередное значение остается меньше 1000.
 *
 * Например, для числа 5 вывод должен быть:
 * 5 25 125 625
 */
public class Task133 {
    public static void loop(int num) {
        var joiner = new StringJoiner(" ");
        int rsl = num;
        while (rsl < 1000) {
            joiner.add(String.valueOf(rsl));
            rsl *= num;
        }
        if (joiner.length() == 0) {
            System.out.print("");
        }
        System.out.print(joiner);

    }
}
