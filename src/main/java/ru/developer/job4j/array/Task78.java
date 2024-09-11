package ru.developer.job4j.array;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Написать код, который выводит в консоль через пробел только те значения, которые встречаются в массиве ровно один раз.
 */
public class Task78 {
    public static void array(int[] nums) {
        Map<Integer, Long> map = IntStream.of(nums)
                .boxed()
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        String rsl = IntStream.of(nums)
                .boxed()
                .filter(i -> map.get(i) == 1)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(rsl);
    }
}
