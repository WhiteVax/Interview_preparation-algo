package ru.developer.job4j.condition;

/**
 * Написать код, который выводит в консоль текстовую форму оценки: 1-2 - "Плохо", 3 - "Удовлетворительно", 4 - "Хорошо",
 * 5 - "Отлично". Если число не соответствует какой-либо оценке - вывести "Не соответствует".
 */
public class Task64 {
    public static void gradePrint(int number) {
        switch (number) {
            case 5 -> System.out.println("Отлично");
            case 4 -> System.out.println("Хорошо");
            case 3 -> System.out.println("Удовлетворительно");
            case 1,2 -> System.out.println("Плохо");
            default -> System.out.println("Не соответствует");
        }
    }
}
