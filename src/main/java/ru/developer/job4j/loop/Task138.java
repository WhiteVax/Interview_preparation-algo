package ru.developer.job4j.loop;

/**
 * Написать код, который определяет и выводит в консоль наибольшее двузначное число, делящееся на сумму своих цифр.
 */
public class Task138 {
    public static void loop() {
        int max = 0;
        for (int i = 10; i < 97; i++) {
            int rsl = i / 10 + i % 10;
            if (i % rsl == 0 && i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
