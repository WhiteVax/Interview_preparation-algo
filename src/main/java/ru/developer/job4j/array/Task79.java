package ru.developer.job4j.array;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Написать код, который выводит в консоль через пробел только те значения, которые встречаются в массиве больше одного раза.
 */
public class Task79 {
    public static void array(int[] nums) {

        Map<Integer, Long> map = IntStream.of(nums)
                .boxed()
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        var string = IntStream.of(nums)
                .distinct()
                .filter(e -> map.get(e) > 1)
                .mapToObj(String::valueOf).collect(Collectors.joining(" "));

        if (string.isEmpty()) {
            System.out.print("");
        } else {
            System.out.println(string);
        }
    }
}
