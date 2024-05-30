package ru.developer.job4j.condition;

/**
 * Написать код, который выводит в консоль время дня, к которому относится входящий час ("Утро", "День", "Вечер", "Ночь").
 * Если число не является каким-либо часом - вывести "Не является часом". Диапазон часов 0-23.
 */
public class Task66 {
    public static void daytime(int number) {
        switch (number){
            case 6, 7, 8, 9, 10 -> System.out.println("Утро");
            case 11, 12, 13, 14, 15, 16, 17 -> System.out.println("День");
            case 18, 19, 20, 21, 22 -> System.out.println("Вечер");
            case 23, 0, 1, 2, 3, 4, 5 -> System.out.println("Ночь");
            default -> System.out.println("Не является часом");
        }
    }
}
