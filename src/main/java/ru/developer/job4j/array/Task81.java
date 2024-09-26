package ru.developer.job4j.array;

/**
 * Метод array должен возвращать массив, который содержит информацию о количестве отрицательных чисел, нулей и положительных чисел (в этом же порядке).
 * Например, для массива значений [5, -5, -4, 0, 3, 1] нужно вернуть массив [2, 1, 3].
 */
public class Task81 {
    public static int[] array(int[] nums) {
        int[] array = new int[3];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                array[0] += 1;
            } else if (nums[i] == 0) {
                array[1] += 1;
            } else {
                array[2] += 1;
            }
        }
        return array;
    }
}
