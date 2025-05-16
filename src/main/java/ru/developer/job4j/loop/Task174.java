package ru.developer.job4j.loop;

/**
 * Написать код, который проверяет, является ли входящее число палиндромом (т.е. симметричным),
 * и выводит в консоль "Да", если является, и "Нет", если не является.
 */
public class Task174 {
    public static void isPalindrome(int number) {
        if (number % 10 == 0) {
            System.out.println("Нет");
            return;
        }

        int reverted = 0;
        while (number > reverted) {
            reverted = reverted * 10 + number % 10;
            number /= 10;
        }
        System.out.println(number == reverted || number == reverted / 10
                ? "Да" : "Нет");
    }
}