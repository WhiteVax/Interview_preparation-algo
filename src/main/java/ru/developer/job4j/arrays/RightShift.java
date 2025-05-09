package ru.developer.job4j.arrays;

/**
 * Ваша задача выполнить циклический сдвиг вправо с шагом count
 * Например,
 * {1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4}
 * {1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 */
public class RightShift {
    public static void shift(int[] nums, int count) {
        for (int i = 1; i <= count; i++) {
            shift(nums);
        }
    }

    private static void shift(int[] nums) {
        int last = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0 ; i--) {
          nums[i] = nums[i - 1];
        }
        nums[0] = last;
    }
}
