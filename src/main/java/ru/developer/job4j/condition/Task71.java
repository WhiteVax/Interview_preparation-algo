package ru.developer.job4j.condition;

/**
 * Написать код, который определяет, каким минимальным набором купюр можно выдать данную сумму. Результат вывести в
 * консоль в виде: "100: x, 50: y, 10: z", где x, y, z - количество соответствующих купюр к выдаче.
 * Если сумму нельзя выдать полностью (Например, 156) - вывести "Нельзя".
 */
public class Task71 {
    public static void change(int money) {
        if (money % 10 != 0) {
            System.out.println("Нельзя");
            return;
        }

        int[] bills = {100, 50, 10};
        int[] rsl = {0, 0, 0};
        for (int counter = 0; counter < bills.length; counter++) {
            while (money - bills[counter] >= 0) {
                rsl[counter] += 1;
                money -= bills[counter];
            }
        }
        System.out.printf("100: %d, 50: %d, 10: %d%n", rsl[0], rsl[1], rsl[2]);
    }
}
