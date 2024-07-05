package ru.developer.job4j.loop;

/**
 * Написать код, который выводит в консоль сумму значений серии чисел. Серия продолжается, пока каждое следующее число больше
 * предыдущего, как только встречается число, которое меньше или равно предыдущему, серия заканчивается.
 */
public class Task115 {
    public static void loop(int[] num) {
        int sum = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i - 1] >= num[i]) {
                break;
            }
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
