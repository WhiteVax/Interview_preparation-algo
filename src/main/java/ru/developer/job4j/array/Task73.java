package ru.developer.job4j.array;

/**
 * Написать код, который выводит в консоль через пробел все значения массива таким образом: в каждой строке
 * выводятся значения из двух ячеек, симметрично расположенных по отношению к середине массива.
 * Если массив имеет нечетный размер, то центральную ячейку нужно вывести в отдельной строке.
 *
 * Например, для массива значений [5, 2, 6, 0, 3] вывод должен быть:
 * 5 3
 * 2 0
 * 6
 */
public class Task73 {
    public static void array(int[] arr) {
        int mid = arr.length / 2;

        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " " + arr[arr.length - 1 - i] + System.lineSeparator());
        }

        if (arr.length % 2 != 0) {
            System.out.println(arr[mid]);
        }
    }
}
