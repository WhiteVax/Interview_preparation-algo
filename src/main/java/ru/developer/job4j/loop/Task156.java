package ru.developer.job4j.loop;

/**
 * Написать код, который графически изображает делимость чисел от 1 до num. Вывести в консоль построчно эти числа
 * с количеством плюсов, равным количеству делителей этого числа. Единица и само число тоже являются делителями.
 * Например, для входящего числа 4 вывод будет:
 * <p>
 * 1+
 * 2++
 * 3++
 * 4+++
 */
public class Task156 {
    public static void loop(int num) {
        for (int i = 1; i <= num; i++) {
            int count = getSumDividers(i);
            System.out.println(i + "+".repeat(count));
        }
    }

    private static int getSumDividers(int num) {
        int count = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
