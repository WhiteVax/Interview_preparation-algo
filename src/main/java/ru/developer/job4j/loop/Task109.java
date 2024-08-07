package ru.developer.job4j.loop;

/**
 *Ниже представлен метод loop(int[] nums), который принимает массив целых чисел.
 * Задание: Написать код, который выводит в консоль сообщение "Код не принят" до момента,
 * пока текущим значением массива в цикле не будет значение 123, после чего вывести "Код принят".
 * Например, для входящего массива значений [100, 200, 50, 123] вывод должен быть:
 * Код не принят
 * Код не принят
 * Код не принят
 * Код принят
 */
public class Task109 {
    public static void loop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 123) {
                System.out.println("Код не принят");
            } else {
                System.out.println("Код принят");
                return;
            }
        }
    }
}
