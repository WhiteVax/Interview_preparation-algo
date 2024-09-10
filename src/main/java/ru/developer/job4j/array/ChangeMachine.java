package ru.developer.job4j.array;

import java.util.ArrayList;
import java.util.List;

/**
 * У вас есть автомат для размена купюр, который может выдать различные варианты размена на монеты номиналом 10, 5, 2 и 1.
 * Ваша задача — написать программу, которая примет купюру на вход и вернет все возможные варианты размена этой суммы.
 * Требования:
 *
 * Написать класс ChangeMachine с методом getChangeVariants, который принимает одно целое число — сумму купюры — и возвращает список возможных вариантов размена.
 * Каждый вариант размена должен быть представлен массивом из 4 элементов, где:
 * Элемент 0 — количество монет номиналом 10,
 * Элемент 1 — количество монет номиналом 5,
 * Элемент 2 — количество монет номиналом 2,
 * Элемент 3 — количество монет номиналом 1.
 * Варианты размена должны включать все возможные способы разменять купюру, используя монеты различных номиналов.
 *
 * Пример:
 * Для входной суммы 10, метод должен вернуть:
 * [
 * [1, 0, 0, 0],  // 1 монета номиналом 10
 * [0, 2, 0, 0],  // 2 монеты номиналом 5
 * [0, 1, 2, 1],  // 1 монета 5, 2 монеты 2, 1 монета 1
 * [0, 0, 5, 0]   // 5 монет номиналом 2
 * ]
 */
public class ChangeMachine {
    public List<int[]> getChangeVariants(int amount) {
        List<int[]> variants = new ArrayList<>();
        if (amount > 0) {
            int banknoteTen = amount / 10;

            while (banknoteTen >= 0) {
                int balanceTen = (amount - banknoteTen * 10) >= 0 ? amount - banknoteTen * 10 : amount;
                int banknoteFive = balanceTen / 5;

                while (banknoteFive >= 0) {
                    int balanceFive = (balanceTen - banknoteFive * 5) >= 0 ? balanceTen - banknoteFive * 5 : balanceTen;
                    int banknoteTwo = balanceFive / 2;
                    int banknoteOne = balanceFive - banknoteTwo * 2;

                    variants.add(new int[]{banknoteTen, banknoteFive, banknoteTwo, banknoteOne});
                    banknoteFive--;
                }
                banknoteTen--;
            }
        }
        return variants;
    }
}
