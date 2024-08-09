package ru.developer.job4j.loop;

/**
 * Старинная задача: сколько можно купить быков и коров на 100 рублей, если плата за быка 10 рублей, а за корову - 5 рублей?
 * Задание: вывести построчно все возможные варианты решения задачи в виде "Быков: х, коров: у".
 */
public class Task153 {
    public static void loop() {
        for (int i = 10; i >= 0; i--) {
            int hundred = 100;
            int bulls = hundred - i * 10;
            hundred -= bulls ;
            System.out.printf("Быков: %d, коров: %d%n", bulls / 10, hundred / 5);
        }
    }
}
