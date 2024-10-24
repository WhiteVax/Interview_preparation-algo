package ru.developer.job4j.array;

import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Написать код, который определяет следующее:
 * - Сколько раз каждая из цифр встречается в массиве.
 * - Какая цифра (цифры) встречается в массиве чаще всего.
 * - Какая цифра (цифры) вообще не встречается в серии.
 * - Какая цифра (цифры) встречается в массиве реже всего.
 * Чаще - это если цифра присутствует больше раз, чем остальные (3, 3, 3, 2, 2, 1 - здесь чаще 3.
 * А случае 3, 3, 2, 2, 1 - чаще 3 и 2). Реже - это если цифра присутствует меньше раз, чем остальные,
 * но не менее одной (3, 3, 3, 2, 2, 1 - здесь реже 1). Если массив состоит из значений только одной цифры,
 * значит она не чаще, и не реже Например (1, 1). Если массив (1, 1, 2) значит 1 - чаще, 2 - реже.
 * Результат нужно вывести в консоль в 2 строки. Вывод должен иметь вид:
 * "1: х, 2: х, 3: х, 4: х, 5: х, 6: х, 7: х, 8: х, 9: х" - первая строка. х - полученные значения.
 * "Чаще: хуz, отсутствует: хуz, реже: хуz" - вторая строка. х, у, z - полученные значения без пробела в порядке возрастания.
 * Если требуемые для вывода цифры отсутствуют, вывести вместо значения ноль.
 * Например, для массива значений [1, 2, 2, 4, 5, 2, 7, 8, 7] вывод должен быть:
 * 1: 1, 2: 3, 3: 0, 4: 1, 5: 1, 6: 0, 7: 2, 8: 1, 9: 0
 * Чаще: 2, отсутствует: 3 6 9, реже: 1 4 5 8
 */
public class Task75 {
    public static void array(int[] arr) {
        Map<Integer, Long> map = IntStream.of(arr).boxed().collect(
                Collectors.groupingBy(k -> k, Collectors.counting()));

        var joinerCounter = new StringJoiner(" ");
        var joinerMinority = new StringJoiner(" ").setEmptyValue(String.valueOf(0));
        var joinerMajority = new StringJoiner(" ").setEmptyValue(String.valueOf(0));
        var joinerAbsent = new StringJoiner(" ").setEmptyValue(String.valueOf(0));

        int minCounter = Integer.MAX_VALUE;
        int maxCounter = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            if (entry.getValue() > maxCounter) {
                maxCounter = Math.toIntExact(entry.getValue());
            }
            if (entry.getValue() < minCounter) {
                minCounter = Math.toIntExact(entry.getValue());
            }
        }

        for (int i = 1; i <= 9; i++) {
            var countStr = i + ": " + map.getOrDefault(i, 0L);
            joinerCounter.add(countStr + (i < 9 ? "," : ""));
            if (!map.containsKey(i)) {
                joinerAbsent.add(String.valueOf(i));
            } else {
                long count = map.get(i);
                if (count == minCounter && maxCounter != minCounter) {
                    joinerMinority.add(String.valueOf(i));
                }
                if (count == maxCounter && maxCounter != minCounter) {
                    joinerMajority.add(String.valueOf(i));
                }
            }
        }

        System.out.println(joinerCounter + System.lineSeparator() +
                "Чаще: " + joinerMajority + ", " +
                "отсутствует: " + joinerAbsent + ", " +
                "реже: " + joinerMinority);
    }
}
