package ru.developer.job4j.condition;

/**
 * Написать код, который определяет к какой из указанных фигур относятся входящие значения, и выводит в консоль "Квадрат",
 * если это квадрат, или "Прямоугольник", если это прямоугольник.
 */
public class Task69 {
    public static void squareOrRectangle(int a, int b) {
       if (a == b) {
           System.out.println("Квадрат");
       } else {
           System.out.println("Прямоугольник");
       }
    }
}
