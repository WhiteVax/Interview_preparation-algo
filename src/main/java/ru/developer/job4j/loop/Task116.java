package ru.developer.job4j.loop;

/**
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 * Задание: Написать код, который выводит в консоль количество цифр этого числа и их сумму в виде: "Количество: х, сумма: у".
 * Например, для входящего числа 222 вывод должен быть:
 * Количество: 3, сумма: 6
 */
public class Task116 {
    public static void loop(int num) {
        int counter = 0;
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            counter++;
            sum += temp;
            num /= 10;
        }
        System.out.printf("Количество: %d, сумма: %d\n", counter, sum);
    }
}
