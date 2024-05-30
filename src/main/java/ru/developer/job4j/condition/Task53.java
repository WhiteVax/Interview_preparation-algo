package ru.developer.job4j.condition;

/**
 * Написать код, который выполняет следующее: если дробь является неправильной, то вывести в консоль соответствующую ей правильную сложную дробь. Например, 12/7 превращается в 1 5/7. То есть вывод для чисел 12 и 7 будет:
 * 1 5/7
 * Во всех остальных случаях вывести "Подсчет не производится".
 */
public class Task53 {
    public static void transformFraction(int num1, int num2) {
        if (num1 >= num2) {
            int counter = num1 / num2;
            num1 %= num2;
            if (num1 == 0) {
                System.out.println(counter);
            } else {
                System.out.printf("%d %d/%d%n", counter, num1, num2);
            }
        } else {
            System.out.println("Подсчет не производится");
        }
    }
}
