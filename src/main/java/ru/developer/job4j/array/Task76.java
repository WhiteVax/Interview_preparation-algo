package ru.developer.job4j.array;

/**
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел - оценки учеников (могут быть от 1 до 5).
 * Задание: написать код, который выводит в консоль информацию о распределении оценок в виде: "5: х, 4: х, 3: х, 2: х, 1: х",
 * где х - количество учеников, получивших данную оценку.
 * Например, для массива значений [5, 5, 4, 3, 3, 1] вывод должен быть:
 * 5: 2, 4: 1, 3: 2, 2: 0, 1: 1
 */
public class Task76 {
    public static void array(int[] arr) {
        int five = 0, four = 0, three = 0, two = 0, one = 0;
        for (int i : arr) {
            switch (i) {
                case 5: five++; break;
                case 4: four++; break;
                case 3: three++; break;
                case 2: two++; break;
                case 1: one++; break;
            }
        }
        System.out.printf("5: %d, 4: %d, 3: %d, 2: %d, 1: %d\n", five, four, three, two, one);
    }
}
