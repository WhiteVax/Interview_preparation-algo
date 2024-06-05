package ru.developer.job4j.loop;

/**
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 * Задание: Написать код, который выводит в консоль сумму делителей входящего числа.
 * Например, для входящего числа 8 вывод должен быть:
 * 15
 */
public class Task71 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
