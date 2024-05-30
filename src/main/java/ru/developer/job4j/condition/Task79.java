package ru.developer.job4j.condition;

/**
 * Написать код, который определяет и выводит в консоль век, к которому относится входящее число.
 * Если число не относится к указанным векам, вывести - "Не попадает в диапазон".
 */
public class Task79 {
    public static void getCentury(int num) {
            if (num < 1501 || num > 2001) {
                System.out.println("Не попадает в диапазон");
            } else {
                int remainder = num % 100;
                int century = remainder >= 1 ? num / 100 + 1 : num / 100;
                System.out.println(century);
            }
    }
}
