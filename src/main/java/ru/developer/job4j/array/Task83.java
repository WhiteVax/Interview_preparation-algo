package ru.developer.job4j.array;

import java.util.HashMap;

/**
 * Задание: вернуть новый массив с индексами двух значений входящего массива, сумма которых равна goal.
 * Реализуйте задачу с линейной скоростью - O(n). Лучшим вариантом будет решение в один проход по карте.
 * Примечание: найденные индексы должны располагаться в порядке их нахождения в оригинальном массиве.
 * Подразумевается, что в каждом входящем массиве имеется либо только одно решение, либо решение отсутствует.
 * <p>
 * Например: есть массив [1, 2, 3], goal - 4. Вывод: [0, 2]
 */
public class Task83 {
    public static int[] sumOfTwo(int[] numbers, int goal) {
        int[] rsl = null;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (var entry : map.entrySet()) {
            int temp = goal - entry.getKey();
            if (temp != entry.getKey() && map.containsKey(temp)) {
                rsl = new int[2];
                rsl[0] = entry.getValue();
                rsl[1] = map.get(temp);
                break;
            }
        }
        return rsl;
    }
}
