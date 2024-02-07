package ru.developer.job4j.type;

/**
 * Задание: Написать код, который высчитывает разницу между его первой (число сотен) и последней (число единиц)
 * цифрой входящего трехзначного числа, умноженную на его среднюю (число десятков) цифру, и выводит результат в консоль.
 * Например, для числа 235 вывод должен быть (2 - 5) * 3:
 * 9
 */
public class Task31 {
    public static void difference(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10 % 10;
        System.out.println(Math.abs((num1 - num3) * num2));
    }

    public static void main(String[] args) {
        difference(235);
    }
}
