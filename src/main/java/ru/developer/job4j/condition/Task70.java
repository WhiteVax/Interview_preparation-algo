package ru.developer.job4j.condition;

/**
 * Написать код, который переводит этот промежуток времени в промежуток, выраженный минутами и секундами.
 * Результат вывести в консоль в виде "Минут: x, секунд: y", где x - минуты, y - секунды. Если входящий промежуток времени
 * превышает один час, то вывести "Расчет не производится".
 */
public class Task70 {
    public static void secondsToMinutes(int seconds) {
        if (seconds > 3600) {
            System.out.println("Расчёт не производился");
        } else {
            int minutes = seconds / 60;
            seconds %= 60;
            System.out.printf("Минут: %s, секунд: %s%n", minutes, seconds);
        }
    }
}
