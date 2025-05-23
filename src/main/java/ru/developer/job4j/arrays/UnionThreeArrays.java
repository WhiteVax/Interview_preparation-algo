package ru.developer.job4j.arrays;

/**
 * Метод принимает 3 массива целочисленных значений, при этом каждый обладает следующими свойствами:
 * 1. Имеет произвольную длину массива.
 * 2. Массив всегда имеет нечетное число элементов.
 * 3. Массив имеет количество элементов на 1 больше, чем массив из пункта 2.
 * Необходимо реализовать метод, который объединит три массива в один. При этом должны выполниться следующие условия:
 * 1. Из первого массива в результирующий массив должны попасть только первый и последний элемент, причем
 * в результирующем массиве они должны находиться на первом и последнем месте, соответственно.
 * 2. Элементы с нечетными индексами из второго массива должны находиться в результирующем массиве на местах с четными индексами.
 * 3. Элементы с четными индексами из третьего массива, должны находиться в результирующем массиве на местах с нечетными индексами.
 */
public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] rsl = new int[2 + middle.length / 2 + right.length / 2];
        rsl[0] = left[0];
        int lCount = 1;
        int rCount = 0;
        rsl[rsl.length - 1] = left[left.length - 1];
        for (int i = 1; i < rsl.length - 1; i++) {
            if (i % 2 == 0) {
                rsl[i] = middle[lCount];
                lCount += 2;
            } else {
                rsl[i] = right[rCount];
                rCount += 2;
            }
        }
        return rsl;
    }
}
