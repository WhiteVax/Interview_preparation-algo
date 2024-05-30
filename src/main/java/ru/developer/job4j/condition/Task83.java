package ru.developer.job4j.condition;

/**
 *Написать код, который определяет, являются ли эти 2 человека:
 * - Тезками, но не однофамильцами (Вывести в консоль "Тезки")
 * - Однофамильцами, но не тезками (Вывести в консоль "Однофамильцы")
 * - И тезками, и однофамильцами (Вывести в консоль "Тезки и однофамильцы")
 * Если совпадений нет - вывести "Совпадений нет".
 */
public class Task83 {
    public static void isEquals(String name1, String surname1, String name2, String surname2) {
       if (name1.equals(name2) && surname1.equals(surname2)) {
           System.out.println("Тезки и однофамильцы");
       } else if (name1.equals(name2)) {
           System.out.println("Тезки");
       } else if (surname1.equals(surname2)) {
           System.out.println("Однофамильцы");
       } else {
           System.out.println("Совпадений нет");
       }
    }
}
