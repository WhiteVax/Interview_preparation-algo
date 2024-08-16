package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который подсчитывает среднюю годовую оценку каждого ученика по 5 предметам. Результат вывести
 * в отдельной строке для каждого ученика в виде: "Оценки: х1 х2 х3 х4 х5, средняя: у". После построчного вывода оценок
 * для каждого ученика вывести в отдельной строке количество учеников, у которых среднегодовая оценка выше 4.5,
 * и наивысшую среднегодовую оценку в виде: "Выше 4.5: х, наивысшая: у".
 *
 * Например, для входящих значений [5, 4, 3, 5, 5], [2, 4, 3, 5, 4], [5, 5, 5, 4, 5] вывод будет:
 * Оценки: 5 4 3 5 5, средняя: 4.4
 * Оценки: 2 4 3 5 4, средняя: 3.6
 * Оценки: 5 5 5 4 5, средняя: 4.8
 * Выше 4.5: 1, наивысшая: 4.8
 */
public class Task167 {
    public static void loop(int[] first, int[] second, int[] third) {
        double avg;
        avg = getAvgAndPrintPoints(first);
        int counter = avg > 4.5 ? + 1 : 0;
        double max = avg;

        avg = getAvgAndPrintPoints(second);
        counter = avg > 4.5 ? counter + 1 : counter;
        max = avg > max ? avg : max;

        avg = getAvgAndPrintPoints(third);
        counter = avg > 4.5 ? counter + 1 : counter;
        max = avg > max ? avg : max;

        System.out.printf("Выше 4.5: %d, наивысшая: %s%n", counter, max);
    }

    private static double getAvgAndPrintPoints(int[] array) {
        double avg = 0;
        var joiner = new StringJoiner(" ");
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
            joiner.add(String.valueOf(array[i]));
        }
        avg = avg / array.length;
        System.out.printf("Оценки: %s, средняя: %s%n", joiner, avg);
        return avg;
    }

    public static void main(String[] args) {
        loop(new int[] {5, 4, 3, 5, 5}, new int[] {2, 4, 3, 5, 4}, new int[] {5, 5, 5, 4, 5});
    }
}
