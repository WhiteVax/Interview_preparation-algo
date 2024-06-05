package ru.developer.job4j.loop;

/**
 * Задание: Написать код, который определяет количество точек, лежащих внутри окружности, и количество точек,
 * лежащих на этой окружности.
 */
public class Task70 {
    public static void loop(int x, int y, int r, int[] coords) {
        int in = 0;
        int on = 0;
        int radius = r * r;
        int result;
        for (int i = 0; i < coords.length - 1; i += 2) {
            result = (int) Math.pow(x - coords[i], 2) + (int) Math.pow(y - coords[i + 1], 2);
            if (result ==radius) {
                on++;
            } else if (result < radius) {
                in++;
            }
        }
        System.out.printf("На окружности: %d, внутри: %d\n", on, in);
    }
}
