package ru.developer.job4j.loop;

/**
 * Написать код, который подсчитывает и выводит в консоль средний балл этих оценок.
 */
public class Task149 {
    public static void loop(int[] grades) {
    double avg = 0.0;
    int counter = 0;
        for (double i : grades) {
            if (i > 5 || i < 1) {
                break;
            }
            avg +=i;
            counter++;
        }
        System.out.printf("%.2f%n", avg / counter);
    }
}
