package ru.developer.job4j.loop;

/**
 * Ниже представлен метод loop(int num, int digit), который принимает целое положительное число num и цифру digit.
 * Задание: Написать код, который проверяет есть ли цифра digit в составе числа num, и выводит в консоль "Да", если есть, или "Нет", если нет.
 * Например, для входящих значений 235, 2 вывод должен быть:
 * Да
 */
public class Task119 {
    public static void loop(int num, int digit) {
        while (num > 0) {
            int temp = num % 10;
            if (temp == digit) {
                System.out.println("Да");
                return;
            }
            num = num / 10;
        }
        System.out.println("Нет");
    }
}
