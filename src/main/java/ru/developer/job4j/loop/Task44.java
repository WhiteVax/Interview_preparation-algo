package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все целые трехзначные числа, которые удовлетворяют условиям выше.
 * Вывод должен выглядеть так:
 * 144 169 288 441 528 768 825 867 882 961
 */
public class Task44 {
    public static void loop() {
        var joiner = new StringJoiner(" ");
        for (int i = 100; i < 1000; i++) {
            int reverseNumber = 0;
            int number = i;
            while (number > 0) {
                reverseNumber = reverseNumber  * 10 + number % 10;
                number = number / 10;
            }
            if (reverseNumber > 100 && i != reverseNumber && Math.sqrt(i*reverseNumber) % 1 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
