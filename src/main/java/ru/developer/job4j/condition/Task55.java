package ru.developer.job4j.condition;

/**
 * Задание: Написать код, который находит этаж квартиры, и какое место она занимает на этом этаже.
 * Результат вывести в консоль построчно. Обозначение расположения квартир: 1 - слева, 2 - центр, 3 - справа.
 */
public class Task55 {
    public static void apartmentPlace(int number) {
        int floor = (int) Math.ceil(number / 3.0);
        int apartment = number % 3;

        if (apartment == 0) {
            apartment = 3;
        }

        System.out.println(floor);
        System.out.println(apartment);
    }
}
