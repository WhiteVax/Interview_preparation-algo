package ru.developer.job4j.loop;

/**
 * По правилам банка, на вклад ежемесячно начисляется определенная сумма, которая зависит от ежемесячного процента на
 * вклад. Например, на вкладе в 10000 рублей с месячным процентом 10% через месяц сумма
 * будет 11000 рублей (10000 + 10% от 10000), а еще через месяц - 12100 (11000 + 10% от 11000).
 *
 * Задание: Написать код, который считает и выводит на экран итоговую сумму на вкладе.
 */
public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = money;
        for (int i = 1; i <= months; i++) {
        sum += sum * percent / 100;
        }
        System.out.printf("%.2f", sum);
    }
}
