package ru.developer.job4j.loop;

/**
 * Написать код, который находит и выводит в консоль все двузначные числа до 70,
 * у которых куб суммы их цифр равен квадрату самого числа.
 */
public class Task87 {
    public static void loop() {
        for (int i = 2; i < 70; i++) {
            int number = i / 10 + i % 10;
            number = number * number * number;
            if (number == i * i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        loop();
    }
}
