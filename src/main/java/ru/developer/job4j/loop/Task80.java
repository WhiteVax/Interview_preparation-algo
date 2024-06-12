package ru.developer.job4j.loop;

/**
 * Задание: Написать код, который выводит в консоль следующую строку: "Средняя удовл. оценка: х, средняя неуд. оценка:
 * у", где х - средний балл удовлетворительных оценок учеников, y - средний балл неудовлетворительных оценок учеников(1-2).
 * Примечание: Учитывать, что количество удовлетворительных, либо неудовлетворительных оценок может быть равно нулю.
 * Например, для входящего массива значений [5, 4, 2, 3, 1] вывод должен быть:
 * Средняя удовл. оценка: 4.0, средняя неуд. оценка: 1.5
 */
public class Task80 {
    public static void loop(int[] grades) {
        double goodAvg = 0.0;
        int countGood = 0;
        double badAvg = 0.0;
        int countBad = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 3) {
                goodAvg+=grades[i];
                countGood++;
            } else {
                badAvg+=grades[i];
                countBad++;
            }
        }
        goodAvg = goodAvg == 0 ? 0 : goodAvg / countGood;
        badAvg = badAvg == 0 ? 0 : badAvg / countBad;
        System.out.printf("Средняя удовл. оценка: %.1f, средняя неуд. оценка: %.1f", goodAvg, badAvg);
    }
}
