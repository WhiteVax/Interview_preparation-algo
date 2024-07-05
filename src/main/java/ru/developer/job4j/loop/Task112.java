package ru.developer.job4j.loop;

/**
 * Задание: Написать код, который уменьшает число num на значения массива nums до тех пор,
 * пока num остается положительным. Вывести в консоль количество раз, на которое было уменьшено число num.
 * Например, для входящих значений 10, [1, 2, 3, 4, 5] вывод должен быть:
 * 3
 */
public class Task112 {
    public static void loop(int num, int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num - nums[i] <= 0) {
                break;
            }
            count++;
            num = num - nums[i];
        }
        System.out.println(count);
    }
}
