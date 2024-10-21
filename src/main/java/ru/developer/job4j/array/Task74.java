package ru.developer.job4j.array;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Написать код, который выводит в консоль через пробел все значения массива таким образом: в первой строке выводятся
 * значения из первой половины массива, начиная с начала, а во второй строке - из второй половины массива, начиная с конца.
 * Если в массиве нечетное число ячеек, то центральная ячейка должна быть на второй строке.
 */
public class Task74 {
    public static void array(int[] arr) {
        String firstPart = String.join(" ", Arrays.stream(arr, 0, arr.length / 2)
                .mapToObj(String::valueOf)
                .toArray(String[]::new));

        String lastPart = String.join(" ", IntStream.range(0, arr.length / 2 + 1)
                .mapToObj(i -> String.valueOf(arr[arr.length - 1 - i]))
                .toArray(String[]::new));

        System.out.println(firstPart);
        System.out.println(lastPart);
    }
}
