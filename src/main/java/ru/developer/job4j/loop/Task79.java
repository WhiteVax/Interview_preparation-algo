package ru.developer.job4j.loop;

/**
 * Написать код, который выводит в консоль следующую строку: "Средняя оценка: х, неуд. оценка: у",
 * где х - средний балл учеников, y - количество неудовлетворительных оценок (1-2).
 * Например, для входящего массива значений [3, 4, 2, 3, 5] вывод должен быть:
 * Средняя оценка: 3.4, неуд. оценка: 1
 */
public class Task79 {
    public static void loop(int[] grades) {
        double avg = 0;
        int bad = 0;
        for (int grade : grades) {
            if (grade < 3) {
                bad++;
            }
            avg += grade;
        }
        avg = avg / grades.length;
        System.out.printf("Средняя оценка: %.1f, неуд. оценка: %d", avg, bad);
    }
}
