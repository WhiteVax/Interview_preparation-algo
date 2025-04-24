package ru.developer.job4j.arrays;

/**
 * Необходимо реализовать метод который принимает 2 параметра:
 * 1. Массив целочисленный значений data.
 * 2. Целое число el, которое мы будем искать в массиве data.
 * При этом должны выполниться следующие условия:
 * 1. Метод должен вернуть сумму элементов массива data, которые находятся до элемента el
 * 2. Если окажется что сумма элементов - четное число - необходимо вернуть это число, иначе - 0.
 */
public class SumWithStopEl {
    public static int sumBefore(int[] data, int el) {
        int sum = 0;
        for (int value : data) {
            if (value == el) {
                break;
            }
            sum += value;
        }
        return sum % 2 == 0 ? sum : 0;
    }
}