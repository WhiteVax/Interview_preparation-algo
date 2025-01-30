package ru.developer.job4j.array;

public class EvenIndexArray {
    public static void print(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i]);
            }
        }
    }
}
