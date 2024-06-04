package ru.developer.job4j.loop;

/**
 * Написать код, который выводит в консоль количество чисел от 10 до 20(оба включительно), в которых разница
 * между первой(десятков) и последней(единиц) цифрами не превышает 3.
 */
public class Task60 {
    public static void loop() {
        int count = 0;
        for (int i = 10; i < 20; i++) {
            if ((i % 10) - (i / 10) <= 3) {
                count++;
            }
        }
        System.out.println(count);
    }
}
