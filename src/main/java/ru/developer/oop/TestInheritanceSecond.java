package ru.developer.oop;

public class TestInheritanceSecond extends TestInheritance{
    @Override
    public void print() {
        System.out.println("Hello it`s second");
    }

    // Сокрытие метода
    public static void printStatic() {
        System.out.println("It`s second static");
    }

    public void printSecond() {
        System.out.println("It`s second");
    }
}
