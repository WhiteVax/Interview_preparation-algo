package ru.developer.job4j.loop;
import java.util.StringJoiner;

/**
 * Написать код, который находит и выводит в консоль через пробел все двузначные числа,
 * равные утроенному произведению их цифр, а также их количество.
 *
 * Вывод должен быть таким:
 * Числа: 15 24, Количество: 2
 */
public class Task88 {
    public static void loop() {
       int counter = 0;
       var joiner = new StringJoiner(" ");
        for (int i = 10; i < 100; i++) {
            if (i / 10 * i % 10 * 3 == i) {
                joiner.add(String.valueOf(i));
                counter++;
            }
        }
        System.out.printf("Числа: %s, Количество: %d", joiner, counter);
    }
}
