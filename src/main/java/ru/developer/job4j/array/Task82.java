package ru.developer.job4j.array;

/**
 * Метод array должен возвращать массив, который содержит информацию о сумме положительных значений во входящем массиве,
 * сумме отрицательных значений, а также количестве нулей (в том же порядке).
 *
 * Например, для массива значений [5, -3, -4, 0, 3, 1] нужно вернуть массив [9, -7, 1].
 */
public class Task82 {
    public static int[] array(int[] nums) {
        int[] array = new int[3];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                array[0] += nums[i];
            } else if (nums[i] < 0) {
                array[1] += nums[i];
            } else {
                array[2] += 1;
            }
        }
        return array;
    }
}
