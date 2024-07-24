package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который преобразует большее из них в меньшее следующим образом:
 * Если преобразуемое число - нечетное, оно уменьшается на 1, а если четное, то оно делится на 2.
 * Вывести в консоль результат преобразования большего числа к меньшему, включая все промежуточные результаты, а
 * также вывести количество выполненных преобразований в виде "Числа: a1 a2 ... aN, Количество: b" где а -
 * промежуточные результаты, b - количество промежуточных результатов.
 * Например, для чисел 3 и 27 вывод должен быть:
 * 26 13 12 6
 */
public class Task141 {
    public static void loop(int x, int y) {
        var joiner = new StringJoiner(" ");
        int counter = 0;
        for (int i = y; i > x; ) {
            if (i % 2 == 0 && i / 2 > x) {
                i /= 2;
                joiner.add(String.valueOf(i));
                counter++;
            } else if (i % 2 != 0 && (i - 1 > x + 1)) {
                i--;
                joiner.add(String.valueOf(i));
                counter++;
            } else {
                i--;
            }
        }
        System.out.printf("Числа: %s, Количество: %d\n", joiner.setEmptyValue(String.valueOf(0)), counter);
    }
}
