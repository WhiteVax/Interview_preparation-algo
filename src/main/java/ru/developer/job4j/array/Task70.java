package ru.developer.job4j.array;

/**
 * Написать код, который выводит в консоль через пробел все значения массива таким образом: в первой строке - первую половину массива,
 * во второй строке - вторую половину массива. Если массив имеет нечетный размер, то центральную ячейку нужно вывести в первой строке.
 */
public class Task70 {
    public static void array(int[] arr) {
        int mid = (arr.length + 1) / 2;

        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i]);
            if (i < mid - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = mid; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
