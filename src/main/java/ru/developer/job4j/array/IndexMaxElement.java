package ru.developer.job4j.array;

/**
 * Надеюсь, что Вы усвоили как необходимо обращаться к элементам массива в общем, и к первому и последнему элементу в частности.
 * В этом задании Вам необходимо расскомментировать код, добавить обращение к элементам массива по индексу
 * и исправить небольшую ошибку. Метод должен вернуть индекс элемента который является максимальным из двух: первый элемент и последний элемент.
 */
public class IndexMaxElement {
    public static int getIndexMax(int[] array) {
        int rsl = array[0] > array[array.length - 1] ? 0 : array.length - 1;
        return rsl;
    }
}
