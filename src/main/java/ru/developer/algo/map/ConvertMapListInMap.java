package ru.developer.algo.map;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Map<Integer, List<Integer>> map = new HashMap<>();
 * map.put(1, List.of(1, 2, 3));
 * map.put(2, List.of(4, 5));
 * <p>
 * Нужно используя стримы развернуть мапу в мапу типа [1, 1], [2, 1], [3, 1], [4, 2], [5, 2];
 */
public class ConvertMapListInMap {
    public Map<Integer, Integer> convert(Map<Integer, List<Integer>> map) {

        return map.entrySet().stream()
                .flatMap(e -> e.getValue().stream().map(i -> Map.entry(i, e.getKey()))
                ).collect(
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
