package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 * Задание: Написать код, который выводит в консоль через пробел в первой строке все четные по месту
 * (то есть находящиеся на четной позиции) цифры этого числа, а во второй строке - все нечетные по месту цифры этого числа.
 * Позиции считать по порядку 123..., то есть в числе 5782 цифра 5 - первая позиция (нечетная),
 * цифра 7 - вторая позиция (четная) и т.д.
 * Например, для числа 261705 вывод должен быть:
 * 6 7 5
 * 2 1 0
 */
public class Task126 {
    public static void loop(int num) {

        StringJoiner even = new StringJoiner(" ");
        StringJoiner odd = new StringJoiner(" ");

        String nums = String.valueOf(num);
        for (int i = 1; i <= nums.length(); i++) {
            if (i % 2 == 0) {
                odd.add(String.valueOf(nums.charAt(i - 1)));
            } else {
                odd.add(String.valueOf(nums.charAt(i - 1)));
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
