package ru.developer.job4j.loop;

/**
 *Ниже представлен метод loop(int[] nums), который принимает массив целых чисел.
 * Задание: Написать код, который выводит в консоль подряд все числа массива до момента,
 * пока текущим значением не окажется 999, а после подсчитывает количество выведенных ранее значений
 * в виде "Значений: x" (кроме 999). Каждый элемент массива выводить с новой строки.
 * Например, для входящего массива значений [1, 50, 100, 999, 1000] вывод должен быть:
 * 1
 * 50
 * 100
 * Значений: 3
 */
public class Task107 {
    public static void loop(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 999) {
                System.out.println(nums[i]);
                count++;
            } else {
                break;
            }
        }
        System.out.printf("Значений: %d\n", count);
    }
}
