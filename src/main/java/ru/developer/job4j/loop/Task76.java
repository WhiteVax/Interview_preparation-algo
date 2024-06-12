package ru.developer.job4j.loop;

/**
 * Написать код, который определяет является ли четной сумма общих делителей двух чисел, и выводит в консоль "Да",
 * если является, или "Нет", если не является. 1 и само число тоже считать за делители.
 */
public class Task76 {
    public static void loop(int num1, int num2) {
        int count = 0;
        int max = num1 > num2 ? num1 : num2;
        for (int i = 1; i <= max; i++) {
            if (num1 % i == 0 || num2 % i == 0) {
                count += i;
            }
        }
        if (count % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
