package ru.developer.job4j.condition;

/**
 * Написать код, который изменяет входящее число следующим образом:
 * - Для четного числа - увеличивает его до ближайшего "круглого" и выводит новое значение в консоль в виде "Увеличено до n".
 * - Для нечетного числа - уменьшает его до ближайшего "круглого" и выводит новое значение в консоль в виде "Уменьшено до n".
 * - Если число оканчивается на 0, то есть оно уже "круглое", то вывести в консоль "Без изменений".
 * n - полученное значение после увеличения/уменьшения.
 */
public class Task45 {
    public static void changeToRoundNum(int number) {
        int lastNumber = number % 10;
        if (lastNumber == 0) {
            System.out.printf("Без изменений\r\n");
        } else if (lastNumber % 2 == 0) {
            System.out.printf("Увеличено до %s\r\n", number + (10 - lastNumber));
        } else {
            System.out.printf("Уменьшено до %s\r\n", number -  lastNumber);
        }
    }
}
